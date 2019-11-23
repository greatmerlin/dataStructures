package com.theo;

import java.util.Arrays;

public class SomeDaysAfterMain {

    public static void main(String[] args) {

        int[] myArray = {20, 35, -15, 7, 55, 1, -22};

        System.out.println(Arrays.toString(myArray));

        insertionSortEx(myArray);

        System.out.println(Arrays.toString(myArray));
    }

    public static void insertionSortEx(int[] array){
        for (int i = 1; i < array.length; i++){
            int temp = array[i];
            int j;
            for (j = i; j > 0 && array[j - 1] > temp; j--){
                array[j] = array[j - 1];
                array[j - 1] = temp;
            }
            array[j] = temp;
        }
    }
}
