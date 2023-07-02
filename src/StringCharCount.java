import java.util.ArrayList;
import java.util.Arrays;

/**
 * Which takes string input and return character count
 *  Use User Stories approach(think from the pint of view of a user what he is trying to solve)
 *   hello => h:1, e:1, l:2, o:1 (if you write it straight forward -- means you write it because  you knew it and have seen earlier)
 * what if user doesn't enter anything -- do i need to return null, blank
 * what if user enter Hi hero --  do i need to count upper case and lower case separate or one entity
 * what if user says -- i Hero! (Do i need to count exclamation)
 * what if user entry Hi Dheeru24 ) DO i need to count number as well)
 * **/


public class StringCharCount {
   static String name = "knowyourownpower";
    static boolean backwardTraversal = false;
   public static void main(String[] args) {
       Character[] charArray = backwardTraversal ?
               naiveWayToConvertStringToArray(true):
               naiveWayToConvertStringToArray(false);

       Arrays.stream(charArray).forEach(System.out::println);
   }
   public static Character[] naiveWayToConvertStringToArray(boolean forward){
       int nameLength = name.length();
       //naive approach
       Character[] nameArray = new Character[nameLength];
       if(forward){
           for(int i = 0; i<nameLength; i++){
               nameArray[i]=name.charAt(i);
           }
       }else{
           for(int i = nameArray.length-1; i>0; i--){
               nameArray[nameLength-i]=name.charAt(i-1);
               }
        }
        return nameArray;

   }


}
