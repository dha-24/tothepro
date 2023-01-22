package recursion;

import java.sql.SQLOutput;

public class FibonacciSeries {
    static int n1 = 0, n2 = 1, n3 = 0, sum = 1;
    static void printFeb(int count){
        if(count>0){
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            sum = sum+n3;
//            System.out.print("{sum = " +sum+"}");
            printFeb(count -1);
        }
    }

    public static void main(String[] args) {
        System.out.println("===Let me print your fibonacci===");
        System.out.print(n1+" "+n2);
        int count = 10;
        printFeb(count-2);
        System.out.println(" and with SUm : "+sum);

    }
}
