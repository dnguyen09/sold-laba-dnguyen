package com.solvd.laba.lab1;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        //iterate over the array, outer loop
        for(int i = 0; i < arr.length - 1; i++) {
            //set the current element to the smallest element
            int minIndex = i;
            //iterate over the remaining element, inner loop
            for(int j = i + 1; j < arr.length; j++) {
                //if find the smallest element, update to minIndex
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            //swap smallest element with current element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        //initialize an array
        int[] array = {6, 2, 1, 10, 15, 7, 6, 4};

        //print array before sorting
        System.out.println("Array: " + Arrays.toString(array));

        //call method selectionSort
        selectionSort(array);

        //print sorted array
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
