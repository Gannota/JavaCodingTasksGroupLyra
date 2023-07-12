package Aida.Week7;

import java.awt.desktop.PreferencesEvent;
import java.util.Arrays;

public class ArraySortDescending {
    public static void main(String[] args) {
        int array[] = {10,20,7, 8, 90};

        Arrays.sort(array);

        reverse(array);

        System.out.println(Arrays.toString(array));
    }
    public static void reverse(int[] array) {

        // Length of the array
        int n = array.length;

        // Swapping the first half elements with last half
        // elements
        for (int i = 0; i < n / 2; i++) {

            // Storing the first half elements temporarily
            int temp = array[i];

            // Assigning the first half to the last half
            array[i] = array[n - i - 1];

            // Assigning the last half to the first half
            array[n - i - 1] = temp;
        }

    }}

/*
3. Array - Sort Descending
        Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
        arr = Sort(arr); ==> {90, 20, 10, 8, 7};
        */