package com.zylee.test;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyJFrame2 extends JFrame implements MouseListener {
    // 创建按钮对象
    private final JButton button = new JButton("按钮1");

    public MyJFrame2() {
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
        button.setBounds(0, 0, 100, 50);
        // 给按钮绑定鼠标时间
        // 参数为 MouseListener 接口的实现类
        button.addMouseListener(this);

        //把按钮添加到界面中
        this.getContentPane().add(button);

        // 设置界面可视
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("单击");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("按下");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("松开");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("滑入");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("滑出");
    }
}
