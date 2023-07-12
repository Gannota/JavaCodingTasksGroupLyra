package Daadman.week3;

public class ReverseNegativeNumbers {



    public static int reverseNegativeNumber(int number) {
        boolean isNegative = false;

        // Check if the number is negative
        if (number < 0) {
            isNegative = true;
            number = Math.abs(number); // or  number *= -1; Convert the negative number to positive
        }

        int reversedNumber = 0;

        // Reverse the digits of the positive number
        while (number > 0) {
            int digit = number % 10; // Get the last digit
            reversedNumber = (reversedNumber * 10) + digit; // Append the digit to the reversed number
            number /= 10; // Remove the last digit from the number
        }

        if (isNegative) {
            reversedNumber *= -1; // Convert the reversed positive number back to negative
        }

        return reversedNumber;
    }

    public static void main(String[] args) {
        int num = -35;
        int reversed = reverseNegativeNumber(num);
        System.out.println("Reversed number: " + reversed);
    }


}



/*

In this example, the reverseNegativeNumber method takes an integer number as input, reverses its digits, and returns the result as an int.

First, the method checks if the number is negative by comparing it with 0. If the number is negative, it sets the isNegative flag to true and converts the negative number to positive using the Math.abs() method.

Next, the method initializes the reversedNumber variable to 0. It then enters a loop where it repeatedly extracts the last digit of the positive number using the modulo operator %. It appends the extracted digit to the reversedNumber by multiplying it by 10 and adding the digit. It also divides the number by 10 to remove the last digit.

After reversing the positive number, if the original number was negative, the method multiplies the reversedNumber by -1 to convert it back to a negative number.

Finally, the reversed number is returned by the method.

In the main method, an example usage is shown where the number -35 is passed to the reverseNegativeNumber method. The reversed number is then printed to the console.

You can test this code by providing different negative numbers to the num variable in the main method and checking the reversed output.
 */