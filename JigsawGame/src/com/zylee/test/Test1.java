package com.zylee.test;

import java.util.Arrays;
import java.util.Random;

public class Test1 {
    static void main() {
        /* 需求：一维数组0-15打乱顺序，添加到二维数组中*/
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        //打乱数组
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }

        // System.out.println(Arrays.toString(tempArr));

        int[][] data = new int[4][4];

        for (int i = 0; i < tempArr.length; i++) {
            data[i / 4][i % 4] = tempArr[i];
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(Arrays.toString(data[i]));
        }
    }
}
