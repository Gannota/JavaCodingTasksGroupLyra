package Aida.Week7;

import java.util.Arrays;

public class ArraySortAscending {
    public static void main(String[] args) {
        int[] array =  {10, 9, 8, 7};

        // Applying sort() method over to above array
        // by passing the array as an argument
        Arrays.sort(array);

        // Printing the array after sorting
        System.out.println("Modified arr[] : "
                + Arrays.toString(array));
        }
    }


/*
2. Array - Sort Ascending
  Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
  Ex: int[] arr = {10, 9, 8, 7};
  arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */