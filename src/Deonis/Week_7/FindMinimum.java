package Deonis.Week_7;

import java.util.Arrays;

public class FindMinimum {

    public static void main(String[] args) {


        int [] numbers = {1,6,8,10,20};

        System.out.println("minNum(numbers) = " + minNum(numbers));
        System.out.println("minNum2(numbers) = " + minNum2(numbers));

    }

    public static int minNum( int[] numbers ) {

        int min = Integer.MAX_VALUE;

        for(int each: numbers){

            if(each < min){
            min = each;

            }
        }
        return min;
    }

    public static int minNum2( int[] numbers ) {

        Arrays.sort( numbers );

        return numbers [0]; }



}
/*
1. Array - Find Minimum
  Write a method that can find the minimum number from an int Array
 */