package com.theo;

import java.util.Arrays;

public class MainFour {

    public static void main(String[] args) {

        int[] myArray = {20, 35, -15, 7, 55, 1, -22};
        System.out.println(Arrays.toString(myArray));

        quickSortMorePractice(myArray, 0, 7);
        System.out.println(Arrays.toString(myArray));
    }

    public static void quickSortMorePractice(int[] array, int front, int back){

        if(back - front < 2){
            return;
        }
        int pivotIndex = partition(array, front, back);
        quickSortMorePractice(array, front, pivotIndex);
        quickSortMorePractice(array, pivotIndex + 1, back);
    }

    private static int partition(int[] array, int front, int back) {
        int pivotElement = array[front];
        while (front < back) {
            while (front < back && array[--back] >= pivotElement) ;
            array[front] = array[back];
            while (front < back && array[++front] < pivotElement) ;
            array[back] = array[front];
        }
        array[back] = pivotElement;
        return back;
    }


}
