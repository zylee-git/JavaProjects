package com.zylee.test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyJFrame3 extends JFrame implements KeyListener {
    public MyJFrame3() {
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

        // 给窗体绑定键盘事件
        this.addKeyListener(this);

        // 设置界面可视
        this.setVisible(true);
    }

    // 若按下按键不松，会重复触发 keyTyped 和 keyPressed 方法
    // e.getKeyCode()获取当前键盘事件的按键编号
    @Override
    public void keyTyped(KeyEvent e) {
        // System.out.println("键入按键");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        System.out.println("按下按键" + key);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("松开按键");
    }
}
