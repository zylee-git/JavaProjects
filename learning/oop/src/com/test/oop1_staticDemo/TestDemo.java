package com.test.oop1_staticDemo;

public class TestDemo {
    static void main() {
        String str = ArrayUtil.printArr(new int[]{1, 2, 3, 4, 5});
        System.out.println(str);

        double avg = ArrayUtil.getAverage(new double[]{1.4, 6.7, 2.3, 9.8});
        System.out.println(avg);
    }
}
