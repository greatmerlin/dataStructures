package com.theo;

import java.util.Arrays;

public class MainSeven {

    public static void main(String[] args) {
        int[] myArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.println(Arrays.toString(myArray));

        quickSortBegToUnd(myArray, 0, 7);
        System.out.println(Arrays.toString(myArray));
    }

    public static void quickSortBegToUnd(int[] array, int front, int back){
        if (back - front <= 1){
            return;
        }
        int pivotIndex = partition(array, front, back);
        quickSortBegToUnd(array, front, pivotIndex);
        quickSortBegToUnd(array, pivotIndex + 1, back);
    }

    private static int partition(int[] array, int front, int back) { // front und back are like pointers
        int pivotElement = array[front];
        while (front < back) {
            while (front < back && array[--back] >= pivotElement) ; // i say, while the points have not met each other
            array[front] = array[back];
            while (front < back && array[++front] <= pivotElement) ;
            array[back] = array[front];
        }
        array[front] = pivotElement;
        return front;
    }

}
