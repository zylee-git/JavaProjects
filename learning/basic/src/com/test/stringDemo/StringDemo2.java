package com.test.stringDemo;

public class StringDemo2 {
    static void main() {
        String a = "abc";
        String b = "abc";
        String c = new String("abc");
        String d = "Abc";

        // 直接==比较，比较的是地址值
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a == d);

        // equal()方法比较，比较的是值
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equals(d));

        // equalsIgnoreCase()方法比较，忽略大小写区别
        System.out.println(a.equalsIgnoreCase(d));
    }
}
