package recursion;
//P(2,3) = 2^3 = 2*2^2, 2*2*2^1
//P(base, power)
//P(base, power-1)
public class Power {

public static long powerFunc(int base, int power){
    if(power <= 0){
        return 1;
    }else return base * powerFunc(base, power-1);
}
    public static void main(String[] args) {
        System.out.println("power is :" + powerFunc(10,3));
        System.out.println("power with powerFuncWithLoop is :" + powerFuncWithLoop(10,3));
    }

    public static long powerFuncWithLoop(int base, int power){
        long powerValue = 1;
    for(int i =0; i<power; i++){
        powerValue = powerValue*base;
      }
    return powerValue;
    }


}
