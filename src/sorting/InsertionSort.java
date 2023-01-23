package sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] inputNumbers = {10, 23, 7, 98,9, 2, 1, 30, 45 };
        int length = inputNumbers.length;


        for(int index = 1 ; index < length ; index++){
          int key = inputNumbers[index];
          int prevIndex = index - 1;



          while( prevIndex > 0 && inputNumbers[prevIndex] > key){
              inputNumbers[prevIndex + 1] = inputNumbers[prevIndex]; // shift the numbers to the right
              prevIndex = prevIndex-1;
          }
            inputNumbers[prevIndex + 1] = key;
        }

        Arrays.stream(inputNumbers).forEach(it -> System.out.println(it));


    }
}
