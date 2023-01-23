package sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] inputNumbers = {10, 23, 7, 98,9, 2, 1, 30, 45 };
        int length = inputNumbers.length;
//        int[] arrayWithFixedSIze = new int[5];
//        arrayWithFixedSIze[2] = 98;

        for(int index = 1 ; index < length ; index++){
          int tmp = 0;

          // while loop iteration 1:  the following while look is swapping all the elements


          while( index > 0 && inputNumbers[index - 1] > inputNumbers[index]){
              tmp = inputNumbers[index];
              inputNumbers[index] = inputNumbers[index  - 1 ];
              inputNumbers[index  - 1 ] = tmp;
              index = index-1;
          }

            // while loop iteration 2:  the following while look is swapping all the elements

//            int key  = inputNumbers[index];
//            int j = index - 1 ;
//
//            while( j > 0 && inputNumbers[j - 1] > key){
//                inputNumbers[j+1] = inputNumbers[j];
//                j = j-1;
//            }
//            inputNumbers[j+1] = key;


        }

        Arrays.stream(inputNumbers).forEach(it -> System.out.println(it));


    }
}
