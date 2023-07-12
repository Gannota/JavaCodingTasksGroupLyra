package Daadman.week7;

public class SortDescending {
    /*
  3. Array - Sort Descending
  Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
  Ex: int[] arr = {10,20,7, 8, 90};
  arr = Sort(arr); ==> {90, 20, 10, 8, 7};
```
     */

    public static int [] sortArray(int [] arr) {
        int temp;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] < arr[j]) {
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

        int [] array = {6,10,9,8,7};

        // Note: In this implementation, the sortArray method uses a nested loop to compare each pair of elements in the array. If the element at the current index i is less than the element at the inner loop index j, the elements are swapped. This process continues until the array is sorted in descending order.
        array = sortArray(array);
        System.out.print("Descending Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
