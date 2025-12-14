package com.zylee.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    /**
     * 游戏主界面
     */
    private static final int pic_w = 240;  // 切分后的拼图宽度
    private static final int pic_h = 135;  // 切分后的拼图高度
    private static final int width = 1152;  // 背景图片宽度
    private static final int height = 748;  // 背景图片高度

    // 创建选项下面的条目对象
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");
    JMenuItem accountItem = new JMenuItem("关于我们");
    JMenuItem helpItem = new JMenuItem("帮助");

    // 切换图片下面的条目对象
    JMenuItem ao = new JMenuItem("苍");
    JMenuItem na = new JMenuItem("七海");
    JMenuItem sk = new JMenuItem("识");
    JMenuItem sr = new JMenuItem("白羽");
    JMenuItem tm = new JMenuItem("紬");
    JMenuItem um = new JMenuItem("羽未");

    private final int MODE = 1;  // 代表移动模式，1表示移动拼图块，0表示移动空白块

    private String imageChoice = "tm/tm01";  // 拼图图片选择

    private int[][] data = new int[4][4];  // 代表加载图片的索引
    private final int[][] win = new int[][]{  // 正确的 data 索引
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
    };

    private int x_blank, y_blank;  // 空白滑块的位置（在 data 二维数组中的索引）

    private int step = 0;  // 统计步数

    // 设置拼图图片位置偏移量
    int offset_x = (width - pic_w * 4) / 2;
    int offset_y = (height - pic_h * 4) * 3 / 5;

    public GameJFrame() {
        // 初始化界面
        init();

        // 初始化菜单
        initMenuBar();

        // 初始化数据，获取二维数组，代表显示图片的顺序
        initData();

        // 加载图片（根据已得到的二维数组作为索引依次显示图片）
        initImage();

        // 设置界面可视
        this.setVisible(true);
    }

    private void init() {
        // 设置界面标题
        this.setTitle("拼图单机版 v1.0");
        // 设置界面置顶
        // this.setAlwaysOnTop(true);
        // 设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 取消默认的居中放置
        this.setLayout(null);
        // 自适应宽高
        this.getContentPane().setPreferredSize(new java.awt.Dimension(width, height));
        this.pack();
        // 设置界面居中
        this.setLocationRelativeTo(null);

        // 给界面添加键盘监听事件
        this.addKeyListener(this);
    }

    private void initMenuBar() {
        // 创建菜单对象
        JMenuBar jMenuBar = new JMenuBar();
        // 创建两个功能选项
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJmenu = new JMenu("关于");
        // 创建切换图片功能选项
        JMenu changeImage = new JMenu("切换图片");
        // 给每个条目绑定事件
        ao.addActionListener(this);
        na.addActionListener(this);
        sk.addActionListener(this);
        sr.addActionListener(this);
        tm.addActionListener(this);
        um.addActionListener(this);
        replayItem.addActionListener(this);
        reLoginItem.addActionListener(this);
        closeItem.addActionListener(this);
        accountItem.addActionListener(this);
        helpItem.addActionListener(this);
        // 将条目添加到选项中
        changeImage.add(ao);
        changeImage.add(na);
        changeImage.add(sk);
        changeImage.add(sr);
        changeImage.add(tm);
        changeImage.add(um);
        functionJMenu.add(changeImage);
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);
        aboutJmenu.add(accountItem);
        aboutJmenu.add(helpItem);
        // 将两个选项添加到菜单中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJmenu);
        // 给菜单添加到界面中
        this.setJMenuBar(jMenuBar);
    }

    private void initData() {
        /*
          初始化图片数据
          目的是打乱16张图片的顺序
         */
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        // 遍历数组，获取随机索引index，将数组i和index调换，完成打乱
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }

        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] == 0) {
                x_blank = i / 4;
                y_blank = i % 4;
            }
            data[i / 4][i % 4] = tempArr[i];
        }
    }

    private void initImage() {
        /*
            按照 data 二维数组的顺序依次显示每一张图片
            不显示右下角的一张
         */
        // 清空原本已经出现的所有图片
        this.getContentPane().removeAll();

        if (victory()) {
            // 显示胜利的图片
            ImageIcon vicPic = new ImageIcon("./image/victory.png");
            int w = vicPic.getIconWidth();
            int h = vicPic.getIconHeight();
            JLabel jl = new JLabel(vicPic);
            jl.setBounds((width - w) / 2, (height - h) / 3, w, h);
            this.getContentPane().add(jl);
        }

        // 显示移动步数
        JLabel stepCountJL = new JLabel("移动步数" + step);
        stepCountJL.setBounds(50, 30, 150, 30);
        stepCountJL.setFont(new Font("宋体", Font.PLAIN, 24));
        this.getContentPane().add(stepCountJL);

        // 细节：先加载的图片在上层，后加载的图片在下层
        // 显示拼图图片
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // 获取图片路径
                String imagePath = "./image/" + imageChoice + "/" + data[i][j] + ".jpg";
                // 创建一个图片 ImageIcon 对象
                ImageIcon icon = new ImageIcon(imagePath);
                // 创建一个 JLabel 对象（管理容器）
                JLabel jLabel = new JLabel(icon);
                // 指定图片位置
                jLabel.setBounds(pic_w * j + offset_x, pic_h * i + offset_y, pic_w, pic_h);
                // 添加图片边框
                jLabel.setBorder(new BevelBorder(BevelBorder.RAISED));
                // 将管理容器添加到界面中
                this.getContentPane().add(jLabel);
            }
        }

        // 显示背景图片
        JLabel jLabel_bg = new JLabel(new ImageIcon("./image/background.jpg"));
        jLabel_bg.setBounds(0, 0, width, height);
        this.getContentPane().add(jLabel_bg);

        // 刷新界面
        this.getContentPane().repaint();
    }

    private void restart() {
        /*
            重置成员变量
            包含索引 data 和计步器 step
         */
        // 打乱 data 数组
        initData();
        // 计步器清零
        step = 0;
        // 重新加载图片
        initImage();
    }

    private boolean victory() {
        /*
            判断是否胜利
         */
        for (int i = 0; i < 14; i++) {
            if (data[i / 4][i % 4] != win[i / 4][i % 4]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // 只在没胜利时执行监听
        if (victory()) return;

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // 只在没胜利时执行监听
        if (victory()) return;

        int code = e.getKeyCode();
        if (code == 65) {  // 按下的是键盘上的 A
            // 清空原本已经出现的所有图片
            this.getContentPane().removeAll();

            // 加载拼图完整图片
            JLabel jl = new JLabel(new ImageIcon("./image/" + imageChoice + "/all.jpg"));
            jl.setBounds(offset_x, offset_y, pic_w * 4, pic_h * 4);
            this.getContentPane().add(jl);

            // 加载背景图片
            jl = new JLabel(new ImageIcon("./image/background.jpg"));
            jl.setBounds(0, 0, width, height);
            this.getContentPane().add(jl);

            // 刷新界面
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int x_move = 0;  // 水平移动方向
        int y_move = 0;  // 竖直移动方向
        // 判断按键
        // 左：37  上：38  右：39  下：40
        int code = e.getKeyCode();

        // 作弊码：C
        if (code == 67) {
            data = new int[][]{  // 正确的 data 索引
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}
            };
            initImage();  // 重新加载图片
        }
        // 重新游戏快捷键：R
        if (code == 82) {
            restart();
        }

        // 只在没胜利时执行执行操作
        if (victory()) return;
        switch (code) {
            case 37:
                x_move = 1;
                y_move = 0;
                step++;  // 移动一次计数器自增一次
                break;
            case 38:
                x_move = 0;
                y_move = 1;
                step++;  // 移动一次计数器自增一次
                break;
            case 39:
                x_move = -1;
                y_move = 0;
                step++;  // 移动一次计数器自增一次
                break;
            case 40:
                x_move = 0;
                y_move = -1;
                step++;  // 移动一次计数器自增一次
                break;
            default:
                x_move = 0;
                y_move = 0;
        }

        if (MODE % 2 == 0) {
            x_move *= -1;
            y_move *= -1;
        }

        // 若不超过范围，移动空白块
        if (y_blank + x_move >= 0 && y_blank + x_move <= 3 & x_blank + y_move >= 0 && x_blank + y_move <= 3) {
            data[x_blank][y_blank] = data[x_blank + y_move][y_blank + x_move];
            x_blank += y_move;
            y_blank += x_move;
            data[x_blank][y_blank] = 0;

            initImage();  // 重新加载图片
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 当前被点击的组件对象
        Object obj = e.getSource();
        if (obj == replayItem) {
            restart();
        } else if (obj == reLoginItem) {
            // 关闭当前游戏主界面
            this.setVisible(false);
            // 打开登录界面
            new LoginJFrame();
        } else if (obj == closeItem) {
            // 关闭 JVM
            System.exit(0);
        } else if (obj == accountItem) {
            // 创建弹框对象
            JDialog jd = new JDialog();
            ImageIcon accountPic = new ImageIcon("./image/WX.jpg");
            JLabel jl = new JLabel(accountPic);
            int w = accountPic.getIconWidth();
            int h = accountPic.getIconHeight();
            jl.setBounds(0, 0, w, h);
            jd.getContentPane().add(jl);
            jd.setSize(w + 30, h + 30);
            jd.setAlwaysOnTop(true);  // 弹框指定
            jd.setLocationRelativeTo(null);  // 弹框居中
            jd.setModal(true);  // 弹框不关闭则无法操作界面
            jd.setVisible(true);
        } else if (obj == helpItem) {
            File helpDoc = new File("docs/help.html");
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(helpDoc.toURI());
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        } else if (obj == ao) {
            Random r = new Random();
            imageChoice = "ao/ao0" + (r.nextInt(6) + 1);
            restart();
        }else if (obj == na) {
            Random r = new Random();
            imageChoice = "na/na0" + (r.nextInt(3) + 1);
            restart();
        }else if (obj == sk) {
            Random r = new Random();
            imageChoice = "sk/sk0" + (r.nextInt(6) + 1);
            restart();
        }else if (obj == sr) {
            Random r = new Random();
            imageChoice = "sr/sr0" + (r.nextInt(9) + 1);
            restart();
        }else if (obj == tm) {
            Random r = new Random();
            imageChoice = "tm/tm0" + (r.nextInt(7) + 1);
            restart();
        }else if (obj == um) {
            Random r = new Random();
            imageChoice = "um/um0" + (r.nextInt(8) + 1);
            restart();
        }
    }
}
