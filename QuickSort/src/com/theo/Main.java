package com.theo;

/**
 * Divide and Conquer Algorithm
 * Recursive Algorithm
 * In place Algorithm
 * Unstable Algorithm
 * Time complexity: O(n*log(n)), worst case O(n^2), mostly worst case if it has to do with only a few elements
 * because of the overhead from the recursion.
 * Using a pivot element to partition the array into two parts
 * Elements < pivot to it's left, Elements > pivot to it's right
 * Pivot will then be in it's correct sorted position
 * Then do the same for the left and the right array
 * End up with 1-element arrays (pivots), which will all be at its correct positions.
 * */

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] myArray = {20, 35, -15, 7, 55, 1, -22};

        System.out.println(Arrays.toString(myArray));

        quickSort(myArray, 0, 7);           // and always array.length (one greater than the last element)

        System.out.println(Arrays.toString(myArray));
    }

    public static void quickSort(int[] array, int front, int back){
        // the back should be one greater than the last valid index in the array

        if (back - front < 2){ // then we are dealing with 1-el array
            return;     // don't do anything
        }

        int pivotIndex = partition(array, front, back);
        /*
        * returns the correct position of the pivot element in the array.
        * at that position, all the elements left from it are smaller and right greater
        * */
        quickSort(array, front, pivotIndex);

        /*
        * What this recursive call does is, it works on the left side and when it  is done, then and only then, it
        * moves on with the next tow and next recursion call to do the same thing on the right side.
        * */

        quickSort(array, pivotIndex +1, back);
    }

    private static int partition(int[] array, int front, int back) {
        // this Method uses the first element as the pivot (it affects complexity)
        int pivot = array[front]; // we choose the first element of the array
        int i = front;
        int j = back;

        while(i < j){ // if i > j they have crossed each other (front > back)

            // traverse the array from right to left looking for the first element: less < pivot
            while(i < j && array[--j] >= pivot); // empty loop body, keep decrementing j until you find
            // an element that is either greater than the pivot or j crosses i.

            if (i < j){     // make sure j didn't cross i
                array[i] = array[j];        // move the element we found at the position i (front):  i < pivot
            }

            // now we want to traverse the array from left to right until we find an element that is greater > pivot
            while (i < j && array[++i] <= pivot); // i = front = pivot, we want to start with the element after the pivot

            if (i < j){     // make sure j didn't cross i
                array[j] = array[i];        // move the element we found at the position j (back):   pivot < j
            }
        }
        // at this point the value of j will be the index, where we want to insert the pivot.
        array[j] = pivot;
        return j;
    }
}
