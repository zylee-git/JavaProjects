package com.test.stringDemo;

public class StringDemo1 {
    static void main() {
        // 第一种：直接赋值
        String str1 = "abc";
        System.out.println(str1);

        // 第二种：空参构造
        String str2 = new String();
        System.out.println("(" + str2 + ")");

        // 第三种：字符数组
        char[] chars = {'a', 'b', 'c', 'd'};
        String str3 = new String(chars);
        System.out.println(str3);
    }
}
