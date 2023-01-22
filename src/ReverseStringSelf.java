public class ReverseStringSelf {
    public static void main(String[] args) {
        String originalString  = "dheeru";

        String reverseString = "";
        for(int  i = originalString.length()-1; i>=0; i--){
            reverseString=reverseString.concat(String.valueOf(originalString.charAt(i)));
            System.out.println(reverseString.concat(String.valueOf(originalString.charAt(i))));
        }
        System.out.println("-----reversed-------");
        System.out.println(reverseString);

    }
}

//think about the problem first before writing the code.
/**
 * Basic Approach
 * Divide and Conquer
 * Two Pointer
 * Frequency Counter
 * */

//Approach should be like:

/**
 * Read the Problem - word by word
 * Understand the problem
 * Break it Down(like its only string, numbers not given, does string contains double quotes as well, special characters as well, sanitise the input like empty or not)
 * Solve or at least simplify (simplify the problem as much as).
 * Repeat - if possible (put it in your own words.)
 */