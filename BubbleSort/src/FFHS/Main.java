package FFHS;

/**
 * Bubble Sort Algorithmus, O(n^2)
 *
 * The first loop iterates from the end of the array to the start of it.
 * The second one, compares the elements 2-2 and puts every time the biggest
 * of the two elements to the right. So every time this loop finishes, the last
 * number is always the biggest. It loops every time until the lastUnsorted Index, which
 * changes by every outer loop. So we don't have any duplicates. 
 * */

public class Main {

    public static void main(String[] args) {

        int[] myArray = {2, 58, -10, 4, 88, 32, 40};

        for (int lastUnsortedIndex = myArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for (int currentElement = 0; currentElement < lastUnsortedIndex; currentElement++){
                if (myArray[currentElement] > myArray[currentElement + 1]){
                    swap(myArray, currentElement, currentElement + 1);
                }
            }
        }

        for (int i = 0; i < myArray.length; i++){
            System.out.println(myArray[i]);
        }
    }

    public static void swap(int[] array, int i, int j){
        if (array[i] == array[j]){
            return;
        }
        else {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

}
