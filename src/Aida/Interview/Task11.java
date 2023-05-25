package Aida.Interview;

import java.util.ArrayList;

public class Task11 {


    public static int[ ] Sort(int[ ] a) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        for(int each: a)
            list.add(each);
        for(int i=0; i < a.length; i++) {
            a[i] = findMax(list);
            list.remove(Integer.valueOf(a[i]));
        }
        return a;
    }
    public static int findMax(ArrayList<Integer> a) {
        int max=Integer.MIN_VALUE;
        for(int each: a)
            max = Math.max(max, each);
        return max;
    }
}



//    10. Write a return method that can sort an int array in descending order
//    without using the sort method of the Arrays class
//    Ex: int[] arr = {10,20,7, 8, 90};
//    arr = Sort(arr); ==> {90, 20, 10, 8, 7};
//    Solution 1: