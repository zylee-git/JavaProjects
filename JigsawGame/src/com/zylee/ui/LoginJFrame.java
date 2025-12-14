package com.zylee.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    /**
     * 登录界面
     */
    public LoginJFrame() {
        // 设置界面尺寸
        this.setSize(488, 430);
        // 设置界面标题
        this.setTitle("拼图单机版 v1.0");
        // 设置界面置顶
        this.setAlwaysOnTop(true);
        // 设置界面居中
        this.setLocationRelativeTo(null);
        // 设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 设置界面可视
        this.setVisible(true);
    }
}
