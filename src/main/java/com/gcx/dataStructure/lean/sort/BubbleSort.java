package com.gcx.dataStructure.lean.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {1,-2,3,5,8};
        System.out.println("排序前");
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println("排序后");
        System.out.println(Arrays.toString(arr));


    }

    private static  void  sort(int arr[]){


        boolean flag = false;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                int temp ;
                if(arr[j]>arr[j+1]){
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(!flag){
                break;
            }else{
                System.out.println("第"+(i+1)+"次交换结果"+Arrays.toString(arr));
                flag = false;
            }
        }

    }
}
