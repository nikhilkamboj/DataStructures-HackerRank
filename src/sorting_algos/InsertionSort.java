package sorting_algos;

/**
 * inserting at appropriate positions to make the array sorted.
 * creating and filling the holes
 */

public class InsertionSort {

    public void sort(int[] array) {
        int lengthArray = array.length;

        int start = 1;
        int hole = 0;
        int value = 0;

        for (int i = start; i < lengthArray; i++ ) {
            hole = i;
            value = array[hole];
            while (hole > 0 && array[hole-1] > value) {
                array[hole] = array[hole-1];
                hole--;
            }
            array[hole] = value;
        }

    }

    static public void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int[] array = {9,2,4,7,8,1,-1,50};
        insertionSort.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

}
