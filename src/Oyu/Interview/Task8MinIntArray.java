package Oyu.Interview;

import java.util.Arrays;

public class Task8MinIntArray {
    /*
    Write a method that can find the minimum number from an intArray
     */
    public static void main(String[] args) {
        int [] array ={1,56,8,4,-1,50,-100};
        System.out.println("minElementArray(array) = " + minElementArray(array));
        System.out.println("minElementArray1(array) = " + minElementArray1(array));
    }
    public static int minElementArray(int [] array){
        Arrays.sort(array);
        return array[0];
    }
    public static int minElementArray1(int [] array){

        int min = Integer.MAX_VALUE;
        for (int eachElement : array) {
            if (eachElement<min){
                min =eachElement;
            }
        }
        return min;
    }
}
