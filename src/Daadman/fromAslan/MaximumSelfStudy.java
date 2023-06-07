package Daadman.fromAslan;

public class MaximumSelfStudy {
/*
    7. Write a method that can find the maximum number form the int Array.

     */



    public static int maxValue(int[] arr) {

        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Input array cannot be null or empty.");
        }

//        int max = Integer.MAX_VALUE;
//        for (int each : arr) {
//            if(each > max) {
//                max = each;
//            }
//        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] numbers = {5,7,9,2,10,21,3};
        int maximum = maxValue(numbers);
        System.out.println("The maximum number is: " + maximum);

    }
}
