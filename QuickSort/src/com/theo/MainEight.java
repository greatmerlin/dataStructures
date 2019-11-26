package com.theo;

import java.util.Arrays;

public class MainEight {

    public static void main(String[] args) {
        int[] myArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.println(Arrays.toString(myArray));

        quickSortBoss(myArray, 0, 7);
        System.out.println(Arrays.toString(myArray));
    }

    public static void quickSortBoss(int[] array, int front, int back){
        if (back - front <= 1){
            return;
        }
        int pivotIndex = partition(array, front, back);
        quickSortBoss(array, front, pivotIndex);
        quickSortBoss(array, pivotIndex + 1, back);
    }

    private static int partition(int[] array, int front, int back) {
        int pivotElement = array[front];
        while (front < back){
            while (front < back && array[--back] >= pivotElement);
            if (front < back) {
                array[front] = array[back];
            }
            while (front < back && array[++front] <= pivotElement);
            if (front < back) {
                array[back] = array[front];
            }
        }
        array[front] = pivotElement;
        return front;
    }
}
