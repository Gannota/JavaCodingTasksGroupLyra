package Daadman.week6;

import java.util.Arrays;

public class MaximumNumber {


    /*
    2. Find Maximum:
  Write a method that can find the maximum number from an int Array.

     */

    public static int maxNumInArray(int [] number){

        int maxNumber = Integer.MIN_VALUE;

        for (int anyNumber : number) {

            if (anyNumber > maxNumber) {
                maxNumber = anyNumber;
            }
        }
        return maxNumber;
    }
    // Or

    public static int maxNumArray(int [] num) {
        Arrays.sort(num);
        return num[num.length-1];

    }

    public static void main(String[] args) {

        int [] array1 = {-23456, -4567445, -342221, -1};
        int [] array2 = {12,23,34,45,56,678,1000};

        System.out.println("maxNumInArray(array1) = " + maxNumInArray(array1));

        System.out.println("maxNumArray(array2) = " + maxNumArray(array2));

        System.out.println("-----------------------------------");

        // Or Directly in main statement
        int[] numbers = {100, 20, 500, 30, 10, 40};

        int max = numbers[0]; // the numbers value (0) is only the assumption now.

        for (int i = 1; i < numbers.length; i++) { //index of i: 1,2,3,4,5

            if(numbers[i] > max) {  // compares the element of the array with current
                // maximum number. if any number in the array matched to be greater than
                // the current max,
                max = numbers[i];  // that number will be assigned to variable max and will
                // keep looping to the end of the Arry (which is five).

            }
        }
        System.out.println("max = " + max);

    }
}
