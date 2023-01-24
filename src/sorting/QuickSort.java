package sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {10, 20, 6, 1, 11, 5, 13};
        int len = arr.length;
        quickSort(arr, 0, len-1);
        Arrays.stream(arr).forEach(it-> System.out.println(it));
    }

    private static void quickSort(int[] arr, int left, int right) {

        if(left < right){
        int pivotIndex = findPivotIndex(arr, left, right);
            quickSort(arr, left, pivotIndex);
            quickSort(arr, pivotIndex + 1, right);
         }

    }

    private static int findPivotIndex(int[] arr, int left, int right) {
        int i = left - 1;
        int pivot = arr[right];

        for(int j =left; j <= right -1; j++){
            if(arr[j] < pivot){
            i++;
            swap(arr, i, j);
            }
        }
        swap(arr, i+1, right);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
