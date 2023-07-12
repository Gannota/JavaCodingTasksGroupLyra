package Mykyta.week6;


import java.util.Arrays;

//2. Find Maximum:
//  Write a method that can find the maximum number from an int Array.
public class Task02_maximum_number_int_array {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,4,3,1,8,0};

        System.out.println(Arrays.toString(arr1));

        System.out.println(maximumNumber(arr1));
    }

    public static int maximumNumber(int[] arr) {
        int max = arr[1];
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

}
