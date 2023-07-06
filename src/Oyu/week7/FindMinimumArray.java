package Oyu.week7;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FindMinimumArray {
    public static void main(String[] args) {
        int[] arr = {10, 25, 41, 1, 9};
        System.out.println("min number in the array is = " + findMin(arr));


    }

    /*
     Write a method that can find the minimum number from an int Array
     */
    public static int findMin(int [] arr) {
       int min = arr[0];
        for (int each : arr) {
            if (each < min){
                min=each;
            }
        }
        return min;
    }
}
