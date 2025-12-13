package com.test.arrayDemo;

public class ArrayDemo1 {
    static void main() {
        // 数组的两种静态初始化方法
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};

        String[] arr3 = new String[]{"Zhangsan", "Lisi"};
        String[] arr4 = {"Zhangsan", "Lisi"};

        // 直接输出数组为地址值
        System.out.println(arr1);  // [I@f6f4d33
        // [: 数组
        // I: int
        // f6f4d33: 地址值
        System.out.println(arr3);  // [Ljava.lang.String;@23fc625e
    }
}
