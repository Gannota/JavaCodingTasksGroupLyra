package Mykyta.week6;

//3. Sum of digits in a string:
//  Write a method that can return the sum of the digits in a string.
//
//  Ex: "A3v15" = > 3 + 1 + 5 = 9
//        return 9
public class Task03_sum_of_digits {

    public static void main(String[] args) {

        String str1 =  "A3v158";
        System.out.println(sumOfDigits(str1));

    }

    public static int sumOfDigits(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 48 && str.charAt(i) <=57) {
                result += str.charAt(i) - 48; //1 - 49
            }
        }
        return result;
    }

}
