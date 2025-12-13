package com.test.stringDemo;

public class StringDemo4 {
    /**
     * StringBuilder的基本操作
     * StringBuilder创建之后的内容是可变的
     */
    static void main() {
        StringBuilder sb = new StringBuilder();  // 空参构造
        System.out.println(sb);

        // append()方法向StringBuilder对象中添加
        // 可以添加int, double, boolean, char, String等
        sb.append(1);
        sb.append(2.5);
        sb.append('a');
        sb.append("字符串");
        System.out.println(sb);

        // reverse()方法进行反转
        sb.reverse();
        System.out.println(sb);

        // length()方法获取长度
        System.out.println("length: " + sb.length());

        // toString()方法将StringBuilder对象转换为String对象
        String str = sb.toString();
        System.out.println(str);
    }
}
