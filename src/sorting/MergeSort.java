package sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {10, 23 ,2 , 8 , 9, 25, -1 };
        sortArray(arr, 0, arr.length-1);
        Arrays.stream(arr).forEach(it-> System.out.println(it));
    }

    private static void sortArray(int[] arr, int left, int right) {

        if(left < right){
            int mid = (left + right) / 2;

            sortArray(arr, left, mid);
            sortArray(arr, mid +1, right);
            sort(arr, left, mid, right);

        }


    }

    private static void sort(int[] arr, int left, int mid, int right) {
        int leftSize = mid - left + 1;
        int rightSize = right - mid;

        int leftSubArray[] = new int[leftSize];
        int rightSubArray[] = new int[rightSize];

        for(int i = 0 ; i < leftSize; i++){
            leftSubArray[i] = arr[left+i]; /// why?? +1
        }
        for(int j = 0 ; j < rightSize; j++){
            rightSubArray[j] = arr[mid + 1 + j]; // why + 1
        }


        //compare

        int i = 0;
        int j = 0;
        int k = left;

        while(i < leftSize && j < rightSize){
            if(leftSubArray[i] <= rightSubArray[j]){
                arr[k] = leftSubArray[i];
                i++;
            } else {
                arr[k] = rightSubArray[j];
                j++;
            }
            k++;
        }

        while(i < leftSize){
            arr[k] = leftSubArray[i];
            i++;
            k++;
        }

        while(j < rightSize){
            arr[k] = rightSubArray[j];
            j++;
            k++;
        }

    }


}
