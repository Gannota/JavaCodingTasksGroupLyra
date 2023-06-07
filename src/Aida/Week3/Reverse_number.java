package Aida.Week3;

public class Reverse_number {
    public static void main(String[] args) {
        int numNeg = -35;
        int numRev =ReverseNegative (-35);
        System.out.println("Negative number "+numNeg+" is Reversed "+numRev);

    }

    public static int ReverseNegative(int num){
        boolean isNegative = num<0?true:false;
        if (isNegative){
            num=num*-1;
        }
        int reverse =0;
        int lastDig =0;

        while (num >= 1) {

            lastDig=num%10; // gives you last digit number
            reverse=reverse*10 + lastDig;
            num=num/10;

        }
        return isNegative ==true?reverse*-1:reverse;
    }
}
