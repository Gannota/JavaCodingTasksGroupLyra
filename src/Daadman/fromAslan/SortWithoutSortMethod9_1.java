package Daadman.fromAslan;

import java.util.ArrayList;
import java.util.Arrays;

public class SortWithoutSortMethod9_1 {

/*
9. Write a return method that can sort an int array in Ascending
order without using the sort method of the Arrays class
Ex:
int[] arr = {10, 9, 8, 7};
arr = Sort(arr);    ==>{ 7, 8, 9, 10};
 */

    public static int[] sort(int[] a) {


        ArrayList<Integer> list = new ArrayList<Integer>();  // This line of code creates an ArrayList named list that will be used to store the elements of the input array.

        for (int eachElmnt : a) list.add(eachElmnt); // This loop iterates over each element (each in the input array a) and adds it to the list using the add method. Means, it copies all the elements from the input array to the ArrayList.

        for (int i = 0; i < a.length; i++) { // This loop iterates over each index i of the input array.

            a[i] = findMin(list); //Within the loop, the findMin method is called with the list as an argument. It returns the minimum value from the list, which is assigned to the element at index i in the input array a. This step essentially replaces the element at index i with the minimum value from the remaining elements in the list.


            list.remove(Integer.valueOf(a[i])); //After assigning the minimum value to the element at index i in the input array, this line of code removes that minimum value from the list. The Integer.valueOf() method is used to convert the int value a[i] to an Integer object for proper removal.


        }
         return a; // Finally, the sorted array a is returned.

    }

    public static int findMin(ArrayList<Integer> a) {
        int min = Integer.MAX_VALUE;

        for (Integer each : a) {
            min = Math.min(min, each);

        }
        return min;
    }

    public static void main(String[] args) {


        int[] arr = {10, 9, 8,7};
        arr = sort(arr);

        System.out.println(Arrays.toString(arr));
    }


}



/*
The code I provided defines a method named Sort that takes an int array a as input and returns a sorted version of the array.

Here's an explanation of how the method works:

ArrayList<Integer> list = new ArrayList<Integer>();: This line of code creates an ArrayList named list that will be used to store the elements of the input array.

for (int each : a) list.add(each);: This loop iterates over each element each in the input array a and adds it to the list using the add method. Means, it copies all the elements from the input array to the ArrayList.

for (int i = 0; i < a.length; i++) {: This loop iterates over each index i of the input array.

a[i] = findMin(list);: Within the loop, the findMin method is called with the list as an argument. It returns the minimum value from the list, which is assigned to the element at index i in the input array a. This step essentially replaces the element at index i with the minimum value from the remaining elements in the list.

list.remove(Integer.valueOf(a[i]));: After assigning the minimum value to the element at index i in the input array, this line of code removes that minimum value from the list. The Integer.valueOf() method is used to convert the int value a[i] to an Integer object for proper removal.

return a;: Finally, the sorted array a is returned.

In summary, the Sort method creates an ArrayList and copies all the elements from the input array to the list. It then iterates over the input array, finding the minimum value from the remaining elements in the list and assigning it to each index of the input array in ascending order. The method essentially performs a selection sort algorithm using the ArrayList to track the remaining minimum values. Finally, it returns the sorted array.
 */