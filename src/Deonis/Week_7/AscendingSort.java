package Deonis.Week_7;

import java.util.ArrayList;
import java.util.Arrays;

public class AscendingSort {

    public static void main(String[] args) {

        int [] numbers = {9,5,6,3,8,5,1,7,2,4};

        System.out.println("ascendingSort(numbers) = " + ascendingSort(numbers));
        System.out.println("ascendingSort2() = " + ascendingSort2(numbers));


    }

    public static String ascendingSort(int[] a) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int each: a)
            list.add(each);
        for(int i=0; i < a.length; i++) {
            a[i] = findMin(list);
            list.remove(Integer.valueOf(a[i]));
        }
        return Arrays.toString(a);
    }
    public static int findMin(ArrayList<Integer> a) {

        int min =Integer.MAX_VALUE;
        for(int each: a)
            min = Math.min(min, each);
        return min;
    }

    public static String ascendingSort2(int[] list) {

        Arrays.sort(list);

       return Arrays.toString(list);





    }


}

/*
2. Array - Sort Ascending
  Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
  Ex: int[] arr = {10, 9, 8, 7};
  arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */
