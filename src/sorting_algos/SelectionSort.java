package sorting_algos;

public class SelectionSort {

    public void sort(int[] array) {
        int arrayLength = array.length;
        int min = 999999;
        int minIndex = 0;
        int temp = 0;

        for (int i = 0; i < arrayLength-1; i++) {
            min = array[i];
            for (int j = i+1; j < arrayLength; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            temp = array[i];
            array[i] = min;
            array[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] array = {9,2,4,7,8,1,-1,50};
        selectionSort.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
