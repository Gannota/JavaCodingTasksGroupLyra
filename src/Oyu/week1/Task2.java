package Oyu.week1;

public class Task2 {

    public static int divideTwoNumbers(int dividend, int divisor){

        if(divisor ==0){
            throw new ArithmeticException("Can not divide by zero");
        } else if (dividend==0) {
            return 0;
        }
        return dividend/divisor;
    }

    public static void main(String[] args) {

        System.out.println(divideTwoNumbers(50, 2));

// tested
    }
}
