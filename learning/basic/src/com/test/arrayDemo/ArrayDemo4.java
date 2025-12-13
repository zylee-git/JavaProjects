package com.test.arrayDemo;

public class ArrayDemo4 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = copyArray(arr1, 2, 5);
        for(int j = 0; j < arr2.length; j++){
            System.out.println(arr2[j]);
        }
    }

    public static int[] copyArray(int[] arr, int from, int to) {
        int[] res = new int[to - from];
        for(int i = from; i < to; i++){
            res[i - from] = arr[i];
        }
        return res;
    }
}
