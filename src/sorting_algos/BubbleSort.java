package sorting_algos;

public class BubbleSort {

    public void sortAsc(int[] array) {
        boolean isSorted = false;
        int arrayLength = array.length;
        int temp = 0;

        for (int i = 0; i < arrayLength-1; i++) {
            for (int j = 0; j < arrayLength-i-1; j++) {
                if (array[j] > array[j+1]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

    }


    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {9,2,4,7,8,1,-1,50};
        bubbleSort.sortAsc(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }



}
