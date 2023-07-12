package Mykyta.week7;

import java.util.Arrays;

public class Task03_arraySortDescending {

    public static void main(String[] args) {

        int[] arr1 = {10,20,7, 8, 90};

        System.out.println(Arrays.toString(Sort(arr1)));

    }

    public static int[] Sort(int[] arr) {

        int[] returnArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {

                int tmp = 0;

                if(arr[i] < arr[j]) {

                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;

                }

            }

            returnArr[i] = arr[i];

        }


        return returnArr;

    }

}

//3. Array - Sort Descending
//  Write a return method that can sort an int array in descending order
//  without using the sort method of the Arrays class
//  Ex: int[] arr = {10,20,7, 8, 90};
//  arr = Sort(arr); ==> {90, 20, 10, 8, 7};