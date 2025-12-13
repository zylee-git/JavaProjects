package com.test.oop1_staticDemo;

import java.util.StringJoiner;

public class ArrayUtil {
    // 私有化构造方法，为了不让外界构建其对象
    private ArrayUtil() {
    }

    // 静态方法，属于类，常用于工具类
    public static String printArr(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for(int i = 0;i < arr.length;i++) {
            if(i < arr.length - 1) {
                sb.append(arr[i]);
                sb.append(", ");
            } else {
                sb.append(arr[i]);
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public static double getAverage(double[] arr) {
        double sum = 0;
        for(double e : arr) {
            sum += e;
        }
        return sum / arr.length;
    }
}
