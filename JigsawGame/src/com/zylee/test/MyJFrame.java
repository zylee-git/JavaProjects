package com.zylee.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyJFrame extends JFrame implements ActionListener {
    // 创建两个按钮对象
    private final JButton button1 = new JButton("按钮1");
    private final JButton button2 = new JButton("按钮2");

    public MyJFrame() {
        // 设置界面尺寸
        this.setSize(603, 680);
        // 设置界面标题
        this.setTitle("拼图单机版 v1.0");
        // 设置界面置顶
        this.setAlwaysOnTop(true);
        // 设置界面居中
        this.setLocationRelativeTo(null);
        // 设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 取消默认的居中放置
        this.setLayout(null);

        // 设置按钮位置和宽高
        button1.setBounds(0, 0, 100, 50);
        button2.setBounds(0, 200, 100, 50);
        // 添加事件监听（会监听鼠标左键和键盘空格）
        // 参数为 ActionListener 接口的实现类
        button1.addActionListener(this);
        button2.addActionListener(this);

        //把按钮添加到界面中
        this.getContentPane().add(button1);
        this.getContentPane().add(button2);

        // 设置界面可视
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 获取当前被触发的按钮对象
        Object source = e.getSource();

        if (source == button1) {
            button1.setSize(200, 200);
        } else if (source == button2) {
            button2.setSize(200, 200);
        }
    }
}
