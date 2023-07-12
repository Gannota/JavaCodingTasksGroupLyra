package Daadman.interviewTasks;

public class MaximumNumber7_1 {

    /*
    7. Write a method that can find the maximum number form the int Array.
            Solution 1:

     */

    public static  int maxValue(int[] n){
        int max = Integer.MIN_VALUE; // -2147483648
        for (int each : n) {
            if (each > max) {
                max = each;
            }
        }
        return max;

    }

    public static void main(String[] args) {

        int[] numbers = {-900000,-40000000};

        System.out.println(maxValue(numbers));

        int maximum = maxValue(numbers);

        System.out.println("The maximum value from the given data is: " + maximum);


    }
/*
    public static int maxValue(int[] n) {


        int max = Integer.MIN_VALUE; //= -2147483648
        for (int each : n) {
            if(each > max) {
                max = each;
            }
        }

        return max;
    }

         */


    /*
    public static void main(String[] args) {
        int[] numbers = {5,6,7,3,9,10};
        System.out.println(Arrays.toString(numbers));

        int maximum = maxValue(numbers);
        System.out.println("The maximum number from the above array is: " + maximum);

    }

         */
}