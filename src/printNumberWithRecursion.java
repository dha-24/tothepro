public class printNumberWithRecursion {

    public static void main(String[] args) {
    funcNegative(4);
//    func(3);
//        func(0);
    }

    static void func(int n){
        if(n<5){


            func(n+1);
            func(n+1);
            System.out.println(n);

        }

    }

    static void funcNegative(int n){
        if(n>0){

            System.out.println(n);
            funcNegative(n-1);
            funcNegative(n-1);

        }

    }


    static void forwardFunc(int n){
        if(n<5){
            System.out.println("fwd : "+n);
            forwardFunc(n+1);
        }

    }

}
