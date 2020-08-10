package com.gcx.dataStructure.lean.sort;

import java.util.Arrays;

/**
 * 思路 ：假设第一个数据是有序的   从后面依次在前面有序的数据中找到合适的位置  移动进行插入
 */
public class InsertSort {

    public static void main(String[] args) {

        int arrp[] = {3,2,-1,5,4};
        System.out.println("排序前"+ Arrays.toString(arrp));
        sort(arrp);
        System.out.println("排序后"+ Arrays.toString(arrp));


    }

    private static void sort(int arr []){

        for (int i = 1; i < arr.length; i++) {
            int inserVal = arr[i];
            int insertIndex = i-1;

            while(insertIndex>=0 && inserVal<arr[insertIndex]){
                arr[insertIndex+1] = arr[insertIndex]  ;
                insertIndex--;
            }
            arr[insertIndex+1] = inserVal;
        }

    }
}
