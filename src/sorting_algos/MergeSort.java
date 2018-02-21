package sorting_algos;

public class MergeSort {


    public void mergeSort(int[] array) {
        int arrayLength = array.length;
        if (arrayLength < 2) {
            return;
        }

        int mid = arrayLength/2;

        int[] left = new int[mid];
        int[] right = new int[arrayLength-mid];

        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }

        for (int i = mid; i < arrayLength; i++) {
            right[i] = array[i];
        }

        mergeSort(left);
        mergeSort(right);
        mergeSortedArrays(array,left,right);

    }


    private void mergeSortedArrays(int[] main, int[] left, int[] right) {

        int leftLength = left.length;
        int rightLength = right.length;

        int mIndex = 0;
        int lIndex = 0;
        int rIndex = 0;

        while (lIndex < leftLength && rIndex < rightLength) {
            if (left[lIndex] <= right[rIndex]) {
                main[mIndex] = left[lIndex];
                mIndex++;
                lIndex++;
            } else {
                main[mIndex] = right[rIndex];
                mIndex++;
                rIndex++;
            }
        }

        while (rIndex < rightLength) {
            main[mIndex] = right[rIndex];
            rIndex++;
            mIndex++;
        }

        while (lIndex < leftLength) {
            main[mIndex] = left[lIndex];
            lIndex++;
            mIndex++;
        }
    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] array = {9,2,4,7,8,1,-1,50};
        mergeSort.mergeSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
