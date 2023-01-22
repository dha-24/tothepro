package recursion;

public class Factorial {
    public static long calcFact(int n){
        if(n>1){
            System.out.println(n);
            return calcFact(n-1)*n; // or we can use n*calcFact(n-1)
        }else
            return 1;
    }

    public static void main(String[] args) {
        System.out.println("Factorial is :" + calcFact(5));
    }
}
