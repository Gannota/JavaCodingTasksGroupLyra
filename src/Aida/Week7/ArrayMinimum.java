package Aida.Week7;

import java.util.Arrays;

public class ArrayMinimum {



    public static void main(String[] args) {
        int array[] = {1, 423, 6, 46, 34, 23, 13, 53, 4};

        //Implemented inbuilt function to sort array
        Arrays.sort(array);

        // after sorting the value at 0th position will minimum and
        //nth position will be maximum
        System.out.println("min-" + array[0] + " max-" + array[array.length - 1]);
        System.out.println("min number is: "+array[0]);
    }

}

/*
1. Array - Find Minimum
  Write a method that can find the minimum number from an int Array

2. Array - Sort Ascending
  Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
  Ex: int[] arr = {10, 9, 8, 7};
  arr = Sort(arr); ==>{ 7, 8, 9, 10};

3. Array - Sort Descending
  Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
  Ex: int[] arr = {10,20,7, 8, 90};
  arr = Sort(arr); ==> {90, 20, 10, 8, 7};
 */