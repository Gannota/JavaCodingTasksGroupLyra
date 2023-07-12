package Daadman.week7;

public class FindMinimum {

    /*
    1. Array - Find Minimum
  Write a method that can find the minimum number from an int Array

     */


    public static int minNumberInArray(int [] number) {

        int minNumber = Integer.MAX_VALUE;

        for (int eachNumber : number) {
            if(eachNumber < minNumber) {
                minNumber = eachNumber;
            }
        }
        return minNumber;
    }

    public static void main(String[] args) {

        int [] arr = {6,250,500,-10000, 0, -1};
        System.out.println("minNumberInArray(arr1) = " + minNumberInArray(arr));


        System.out.println("____________________________________");

        //or Directly in Main Method

        int[] numbers = {100, 20, 500, 30, 10, 40};

        int min = numbers[0]; // the numbers value (0) is only the assumption now.

        for (int i = 1; i < numbers.length; i++) { //index of i: 1,2,3,4,5

            if(numbers[i] < min) {  // compares the element of the array with current
                // minimum number. if any number in the array matched to be less than
                // the current min,
                min = numbers[i];  // that number will be assigned to variable min and will
                // keep looping to the end of the Arry (which is five).

            }
        }



        System.out.println("Minimum number = " + min);
    }
}
