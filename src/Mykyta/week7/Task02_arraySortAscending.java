package Mykyta.week7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task02_arraySortAscending {

    public static void main(String[] args) {

        int[] arr1 = {10, 9, 8, 7};

        System.out.println(Arrays.toString(Sort(arr1)));

    }

    public static int[] Sort(int[] arr) {

        int[] returnArr = new int[arr.length]; // Create new empty array same size with given

        for (int i = 0; i < arr.length; i++) { //iterate through each element of given array
            for (int j = i+1; j < arr.length; j++) { //compare one item with next item
                int tmp = 0; // temporary variable
                if (arr[i] > arr[j]) { // if current number is greater then next one
                    tmp = arr[i]; // assign temp value to this
                    arr[i] = arr[j]; //current var to next one
                    arr[j] = tmp; // assign next number value to tmp so we can make another circle
                }
            }
            //System.out.println(arr[i]);
            returnArr[i] = arr[i]; // Save everything to new array
        }

        return returnArr; // return it
    }


}

/*
2. Array - Sort Ascending
  Write a return method that can sort an int array in
  Ascending order without using the sort method of the Arrays class
  Ex: int[] arr = {10, 9, 8, 7};
  arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */