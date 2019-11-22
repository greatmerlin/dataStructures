package com.theo;

import java.util.Arrays;

public class MainTwo {

    public static void main(String[] args) {

        int[] myArray = {20, 35, -15, 7, 55, 1, -22};

        System.out.println(Arrays.toString(myArray));

        quickSort(myArray, 0, 7);

        System.out.println(Arrays.toString(myArray));
    }

    public static void quickSort(int[] array, int front, int back){
        if (back - front < 2){
            return;
        }
        int pivotIndex = partition(array, front, back);
        quickSort(array, front, pivotIndex);
        quickSort(array, pivotIndex + 1, back);
    }

    private static int partition(int[] array, int front, int back) {
        int pivot = array[front];
        while(front < back){
            while (front < back && array[--back] >= pivot);
                array[front] = array[back];
            while (front < back && array[++front] <= pivot);
                array[back] = array[front];
        }
        return back;
    }
}
