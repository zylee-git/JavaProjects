package com.test.stringDemo;

import java.util.StringJoiner;

public class StringDemo5 {
    /**
     * StringJoiner的基本操作
     */
    static void main() {
        // 参数表示指定分隔符，前缀，后缀
        StringJoiner sj = new StringJoiner(", ", "[", "]");

        for(int i = 0;i < 3;i++){
            sj.add(i + "");  // add()方法进行添加
        }

        System.out.println(sj.length());  // length()方法获取长度

        String str = sj.toString();  // toString()方法转换为String

        System.out.println(str);
    }
}
