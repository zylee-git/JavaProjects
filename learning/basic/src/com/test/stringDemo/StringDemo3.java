package com.test.stringDemo;

import java.util.Scanner;

public class StringDemo3 {
    /**
     * 遍历字符串
     * charAt()根据索引返回字符
     * length()返回字符串长度
     */
    static void main() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();  // 键盘输入一个字符串

        int len = str.length();
        System.out.println("length: " + len);

        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
}
