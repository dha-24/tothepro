package sorting;

import java.util.Arrays;
import java.util.stream.Stream;

public class SortCharactersUsingCountingSort {

    public static void main(String[] args) {

        char arr[] = { 'y', 'o', 'u', 'c', 'a', 'n', 'l', 'e', 'a', 'r', 'n', 'a', 'l', 'g', 'o' };
        System.out.print ("Given Values : ");
        Stream.of(arr).forEach(it-> System.out.print(it));
        System.out.println();
        System.out.print("Sorted values :");
        usingCountingSort(arr, arr.length);
        Stream.of(arr).forEach(it-> System.out.print(it));
        System.out.println();
        System.out.println("Done! Happy");
    }

    private static void usingCountingSort(char[] arr, int len) {
        char op[] = new char[len];
        int count[] = new int[256];

        Arrays.fill(count, 0);

        for(int i = 0; i<len; i++){
            ++count[arr[i]];
        }

        for(int i = 1; i < count.length ; i++){
            count[i] += count[i-1];
        }

        for(int i = len - 1; i>=0; i--){
               op[count[arr[i]] -1] = arr[i];
              --count[arr[i]];
        }

        for (int i = 0; i < len; ++i)
            arr[i] = op[i];
    }

}
