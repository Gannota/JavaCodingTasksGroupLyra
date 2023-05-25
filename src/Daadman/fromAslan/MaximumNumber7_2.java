package Daadman.fromAslan;

import java.util.Arrays;

public class MaximumNumber7_2 {

     /*
    7. Write a method that can find the maximum number form the int Array.
Solution 2:

     */

    public static int maxValue(int[] n) {
        Arrays.sort(n);
        return n[n.length - 1];


    }




    public static void main(String[] args) {

        int[] numbers = {-3,-4,-5,-9,-8,-5,-1,-900};
        System.out.println("The maximum number from the above given data is: " + maxValue(numbers));

        int maximum = maxValue(numbers);
        System.out.println("The maximum number from the above given data is: "+ maximum);
    }

}

/*
The code I provided defines a method named maxValue that takes an int array n as input and returns the maximum value in that array.

Here's an explanation of how the method works:

Arrays.sort(n);: This line of code sorts the input array n in ascending order using the sort method from the Arrays class. By sorting the array, the largest element will be moved to the last index.

return n[n.length - 1];: After sorting the array, the method retrieves the last element of the sorted array using n.length - 1. Since the array is sorted in ascending order, the last element will be the maximum value.

In summary, the maxValue method sorts the input array in ascending order and returns the last element, which represents the maximum value in the array.
 */