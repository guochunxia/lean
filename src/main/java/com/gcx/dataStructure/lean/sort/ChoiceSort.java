package com.gcx.dataStructure.lean.sort;

import java.util.Arrays;

public class ChoiceSort {

    public static void main(String[] args) {
        int arr[] = {3,5,4,-5,1};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    private static void sort(int arr[]){

        for (int i = 0; i < arr.length-1; i++) {
            int min = arr[i];
            int minIndex = i;
            for (int j = i; j < arr.length-1; j++) {
                if(min > arr[j+1]){
                    min = arr[j+1];
                    minIndex = j+1;
                }
            }
            //交换
            arr[minIndex] = arr[i];
            arr[i] = min;
        }
        
    }
}
