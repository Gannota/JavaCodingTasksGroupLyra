package Maria.week3;

public class ReverseNegativeInt {

    public static int reverseInteger(int number) {
        boolean isNegative = number < 0 ? true : false;
        if(isNegative) {
            number = number * -1;
        }
        int reverse = 0;
        int lastDigit = 0;

        while (number >= 1) {
            lastDigit = number % 10; // gives you last digit
            reverse = reverse * 10 + lastDigit;
            number = number / 10; // get rid of last digit
        }
        return isNegative == true? reverse*-1 : reverse;
    }

    public static void main(String[] args) {

        System.out.println(ReverseNegativeInt.reverseInteger(-124));  // -421
    }


}
