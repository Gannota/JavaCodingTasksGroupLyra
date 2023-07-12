package Mykyta.week8;

import java.util.ArrayList;
import java.util.Arrays;

public class Task02_ZerosToTheEnd {

    public static void main(String[] args) {

        int[] arr1 = {1, 0, 2, 0, 3, 0, 4, 0};

        System.out.println(Sort(arr1));

    }

    public static int[ ] Sort(int[ ] a) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int each: a) list.add(each);
        for(int i=0; i < a.length; i++) {

            a[i] = findMax(list);
            list.remove(Integer.valueOf(a[i]));
        }
        return a; }
    public static int findMax(ArrayList<Integer> a) { int max=Integer.MIN_VALUE;
        for(int each: a)
            max = Math.max(max, each);
        return max; }

}
/*
Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
  Example:
    input; [1, 0, 2, 0, 3, 0, 4, 0]
    output:[1, 2, 3, 4, 0, 0, 0, 0]
 */