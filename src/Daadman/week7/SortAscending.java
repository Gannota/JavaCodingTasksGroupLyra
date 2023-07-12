package Daadman.week7;

public class SortAscending {

    /*
    2. Array - Sort Ascending
  Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
  Ex: int[] arr = {10, 9, 8, 7};
  arr = Sort(arr); ==>{ 7, 8, 9, 10};
     */

    public static int [] sortArray(int [] arr) {
        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    // Swap elements if they are in the wrong order
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int [] array = {10,9,8,7};

        // Note: In this implementation, the sortArray method uses a nested loop to compare each pair of elements in the array. If the element at the current index i is greater than the element at the inner loop index j, the elements are swapped. This process continues until the array is sorted in ascending order.
        array = sortArray(array);
        System.out.print("Sorted Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
