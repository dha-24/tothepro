package recursion;


/*
Multiple ways to implement fib series : TODO
1)  (Use recursion) : Time Complexity: Exponential   : Done
2)  (Use Dynamic Programming): O(n) for given n
3)  (Using power of the matrix {{1, 1}, {1, 0}}) : O(n)
4)  (Using power of the matrix {{1, 1}, {1, 0}}) : O(n) or O(logn)
5) (Another approach(Using Binet’s formula)  : O(logn), this is because calculating phi^n takes logn time
 */


public class FibonacciSeries {

    public static void main(String[] args) {
        int n = 9;
        System.out.println(printFib(n));
    }

    private static int printFib(int n) {
        if( n == 0) return 0;
        else if( n == 1) return 1;
        else return printFib(n-1) + printFib(n-2);
    }
}
