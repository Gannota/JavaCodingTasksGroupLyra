package Daadman.week6;

public class SumOfDigits {


    /*
    3. Sum of digits in a string:
  Write a method that can return the sum of the digits in a string.

  Ex: "A3v15" = > 3 + 1 + 5 = 9
        return 9
     */

    public static int sumOfDigits(String str){

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(Character.isDigit(ch)){

                int digit = Character.getNumericValue(ch);

                sum+= digit;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        String str = "A3v15";

        int summed = sumOfDigits(str);

        System.out.println("summed = " + summed);



    }
/*
    public static int sumOfDigits(String str) {  // In this implementation, the sumOfDigits method takes a string as input.

        int sum = 0;


        for (int i = 0; i < str.length(); i++) { // And it (sumOfDigits method) iterates through each character of the string.

            char ch = str.charAt(i);
            if(Character.isDigit(ch)) { //  It(sumOfDigits method) checks if the character is a digit, using the Character.isDigit() method.
                int digit = Character.getNumericValue(ch); //If it is a digit, it (sumOfDigits method) converts the character to an integer value, using the Character.getNumericValue() method. //
                 sum += digit; // and adds it to the sum variable.
            }
        }

        return sum;  //Finally, it(sumOfDigits method) returns the calculated sum of the digits.
    }

    public static void main(String[] args) {

        String str = "A3v15";

        int summed = sumOfDigits(str); // The main method demonstrates an example usage of the sumOfDigits method by passing a string and printing the result.

        System.out.println("Ex: Sum of Digits 'A3v15' = > 3 + 1 + 5 = " + summed);

    }

 */
}
