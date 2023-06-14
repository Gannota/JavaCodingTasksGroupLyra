package Mykyta.week3;

public class Task2 {
    public static void main(String[] args) {

        reversePositive(54);
        System.out.println(reverseNegative1(-54));
        System.out.println(reverseNegative2(-54));
    }

    // Method 1 - Reverse positive (Void - String)
    public static void reversePositive(int num) {
        int result = 0;

        int n1 = num / 10;
        int n2 = num % 10;

        System.out.println("" + n2 + n1);
    }

    // Method 2 - Reverse negative (String)
    public static String reverseNegative1(int num) {

        String result = "";

        num *= -1; // make it positive
        int n1 = num / 10;
        int n2 = num % 10;

        result = "-" + n2 + n1;

        return result;
    }

    // Method 3 - Reverse negative (int)
    public static int reverseNegative2(int num) {
        num *= -1;

        int reverse = 0;
        int lastDigit = 0;

        while(num >= 1) {
            lastDigit = num % 10; // gives the last digit of the number
            reverse = reverse * 10 + lastDigit;
            num = num / 10; // removes the last digit of the number

        }
        return reverse * -1;
    }
}

/*
   public static int reverseNumber(int number)
{
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
return isNoNegative == true? reverse*-1 : reverse;
}
}

 */




/*
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */