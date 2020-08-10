package com.gcx.dataStructure.lean.sort;

import java.util.Arrays;

public class ShellSort {

    public static void main(String[] args) {
        int arr[]={3,5,-2,1,8,-5};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int arr[]) {
        for (int gap = arr.length / 2; gap > 0; gap = gap / 2) {

            // 从第 gap 个元素，逐个对其所在的组进行直接插入排序
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                int temp = arr[j];
                if (arr[j] < arr[j - gap]) {
                    while (j - gap >= 0 && temp < arr[j - gap]) {
                        arr[j] = arr[j - gap];
                        j -= gap;
                    }
                    arr[j] = temp;
                }
            }
        }
    }
}