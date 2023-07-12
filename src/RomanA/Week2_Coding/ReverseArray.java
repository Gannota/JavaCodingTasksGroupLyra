package RomanA.Week2_Coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = { 5, 2, 1, 8, 10 };
       // Arrays.sort(arr, Collections.reverseOrder());

        // 10, 8, 5, 2, 1,
        System.out.println(reverseArr(arr));

    }

    public static Integer[] reverseArr(Integer[] arr){

        Arrays.sort(arr, Collections.reverseOrder());

        return arr;
    }

    public static ArrayList<Integer> reverseArr(int[] arr){
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : arr) {
            list.add(each);
        }
        Collections.reverse(list);

        return list;
    }
}
