package Oyu.Interview;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArrayDescendingOrder {
//    Write a return method that can sort an int array in descending order
//    without using the sort method of the Arrays class
//    Ex: int[] arr = {10,20,7, 8, 90};
//    arr = Sort(arr); ==> {90, 20, 10, 8, 7};
public static void main(String[] args) {
    int [] array = {10,20,7, 8, 90};
    array = sortArray(array);
    System.out.println(Arrays.toString(array));
}

    public static int [] sortArray(int [] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for(int each :arr){
            list.add(each);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i]=findMax(list);
            list.remove(Integer.valueOf(arr[i]));
        }


        return arr;
    }
public static int findMax(ArrayList<Integer>  aList){
        int max= Integer.MIN_VALUE;
        for(int each : aList){
            max=Math.max(max, each );
        }
        return max;
}

}
