package Oyu.Interview;

import java.util.Arrays;

public class Task7MaxIntArray {
    /*
     Write a method that can find the maximum number from an int
            Array
     */
    public static void main(String[] args) {

        int [] arr ={15,42,4,15,150};
        int [] arr1 ={15,42,4,15,250};

        System.out.println("maxArray(arr) = " + maxArray(arr));
        System.out.println("maxArray1(arr) = " + maxArray1(arr1));
    }
    public static int maxArray (int [] n){
        Arrays.sort(n);
        return n[n.length-1];
    }
    public static int maxArray1 ( int [] num){
        int max = Integer.MIN_VALUE;
        for(int each : num){
            if(each > max){
                max=each;
            }
        }
        return max;
    }
    /*
    public static int maxValueArrayElement(int [] n){
       Arrays.sort(n);
        return n[n.length-1];
   }
    public static int maxValueArrElement(int [] n){

        int max = Integer.MIN_VALUE;
        for( int each : n){
            if(each > max){
                max=each;
            }
        }
        return max;
    }
     */

}
