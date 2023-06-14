package Daadman.fromAslan;

public class MinimumNumber8_1 {

    /*
    Write a method that can fin the minimum number from an int Array.

    Solution 1:

     */
/*
    public static int minValue(int[] n) {
        int min = Integer.MAX_VALUE; // 2147483647
        for (int eachMin : n) {
            if(eachMin < min) {
                min = eachMin;

            }
        }

        return min;
    }

    public static void main(String[] args) {

        int [] numbers = {8,4,21,7,1,9};

        System.out.println("The minimum number from the above given data is: " + minValue(numbers));

        int minimum = minValue(numbers);
        System.out.println("The minimum number from the above given data is: " + minimum);

    }

 */

    public static  int minValue(int[] arrNum){

        int min = Integer.MAX_VALUE; // 2147485647
        for (int eachElmnt : arrNum) {
            if(eachElmnt < min ) {
                min = eachElmnt;

            }
        }

        return min;
    }

    public static void main(String[] args) {

        int[] myNumbers = {-40000,-500000000,50};
        int minimum = minValue(myNumbers);

        System.out.println("The minimum number from the above given data is: " + minimum);
    }
}

