package com.zylee.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test2 {
    static void main() {
        JFrame jf = new JFrame();
        // 设置界面尺寸
        jf.setSize(603, 680);
        // 设置界面标题
        jf.setTitle("拼图单机版 v1.0");
        // 设置界面置顶
        jf.setAlwaysOnTop(true);
        // 设置界面居中
        jf.setLocationRelativeTo(null);
        // 设置关闭模式
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 取消默认的居中放置
        jf.setLayout(null);

        // 创建按钮对象
        JButton button = new JButton("按钮");
        // 设置位置和宽高
        button.setBounds(0, 0, 100, 50);
        // 添加事件监听（会监听鼠标左键和键盘空格）
        // 参数为 ActionListener 接口的实现类
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("按钮被触发");
            }
        });

        //把按钮添加到界面中
        jf.getContentPane().add(button);

        // 设置界面可视
        jf.setVisible(true);
    }
}
