package Deonis.Week_3;

public class ReverseNegativeNumber {
    public static void main(String[] args) {


        System.out.println(reverse(-35));
    }

    public static int reverse(int number) {
        boolean isNoNegative = number < 0 ? true : false;
        if(isNoNegative)
        {
            number = number * -1; //makes the number positive if the given number is negative
        }
        int reverse = 0;
        int lastDigit = 0;
        while (number >= 1)
        {
            lastDigit = number % 10; // gives the last digit of the number
            reverse = reverse * 10 + lastDigit;
            number = number / 10; // removes the last digit of the number
        }
//makes the number negative

        if(isNoNegative==true){
            return reverse*-1;
        }else {
            return reverse;
        }

    }
}
