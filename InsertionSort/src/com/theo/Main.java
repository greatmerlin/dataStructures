package com.theo;

import java.util.Arrays;

public class Main { // Insertion Sort, In place Algorithm, Stable Algorithm, Time Complexity: O(n^2)

/*    public static void main(String[] args) {

        int[] myArray = {20, 35, -15, 7, 55, 1, 22};

        System.out.println(Arrays.toString(myArray));

        insertSort(myArray);

        System.out.println(Arrays.toString(myArray));

    }*/

    public static void insertSort(int[] array){
        for (int i = 1; i <= array.length - 1; i++) { // 0 is by default sorted, traverse from left to right (6 times)
            int UnsortedIndex = array[i]; // the [i] increments by 1 by each Iteration
            int j; // we need it outside of the loop init value of integers = 0.
            for(j = i; j > 0 && array[j - 1] > UnsortedIndex; j--){ // important, init with j = i
                /*
                * j > 0 : as long as we haven't hit the FRONT of the array
                * && : and
                * array[j - 1] > UnsortedIndex : as long as the previous element is greater than (>) the current element,
                * break the loop. no need to hit the front of the array because we have found the correct insertion
                * position
                * */
                array[j] = array[j - 1]; // swift the element at the right, as long as the new Element is smaller
            }
            array[j] = UnsortedIndex; // when we drop out of the loop, the j is the place where the UnsortedIndex needs to be.
        }

    }
}
