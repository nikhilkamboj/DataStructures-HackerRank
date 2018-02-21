package sorting_algos;

public class BubbleSort {

    public void sortAsc(int[] array) {
        int arrayLength = array.length;

        for (int i = 0; i < arrayLength-1; i++) {
            for (int j = 0; j < arrayLength-i-1; j++) {
                if (array[j] > array[j+1]) {
                  swap(array,j,j+1);
                }
            }
        }
    }

    public void sortDesc(int[] array) {
        int arrayLength = array.length;

        for (int i = 0; i < arrayLength-1; i++) {
            for (int j = 0; j < arrayLength-i-1; j++) {
                if (array[j] < array[j+1]) {
                    swap(array,j,j+1);
                }
            }
        }

    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] array = {9,2,4,7,8,1,-1,50};
        bubbleSort.sortDesc(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }



}
