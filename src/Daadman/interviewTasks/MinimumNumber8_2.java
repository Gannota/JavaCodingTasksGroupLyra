package Daadman.interviewTasks;

import java.util.Arrays;

public class MinimumNumber8_2 {

     /*
    Write a method that can fin the minimum number from an int Array.

    Solution 2:

     */

    public static int minValue(int[] n) {
        Arrays.sort(n);
        return n[0];
    }

    public static void main(String[] args) {

        int[] numbers = {-7,-5,-80000,0,-2147483645};
        System.out.println("The minimum number from the above given data is: " + minValue(numbers));

        int minimum = minValue(numbers);
        System.out.println("The minimum number from the above given data is: " + minimum);
    }
}



/*
The code I provided defines a method named minValue that takes an int array n as input and returns the minimum value in that array.

Here's how the method works:

Arrays.sort(n);: This line of code sorts the input array n in ascending order using the sort method from the Arrays class. By sorting the array, the smallest element will be moved to the first index.

return n[0];: After sorting the array, the method retrieves the first element of the sorted array using n[0]. Since the array is sorted in ascending order, the first element will be the minimum value.

In summary, the minValue method sorts the input array in ascending order and returns the first element, which represents the minimum value in the array.





 */
