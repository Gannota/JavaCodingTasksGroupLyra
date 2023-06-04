package Oyu.week3;

public class ReverseNegativeNumber {
    /*
    Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
     */
    public static void main(String[] args) {
        System.out.println(reverseNegative(-136));

    }
    public static int reverseNegative(int n){
        int reverse =0;
        int remainder=0;
        while (n<0){
            remainder= n %10;
            reverse =reverse*10 +remainder;
            n = n/10;

        }
        return reverse;
    }
}
