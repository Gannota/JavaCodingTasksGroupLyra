package Oyu.week8;

import java.util.Arrays;

public class Task2 {

    /*
    Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
  Example:
    input; [1, 0, 2, 0, 3, 0, 4, 0]
    output:[1, 2, 3, 4, 0, 0, 0, 0]
     */

    public static void main(String[] args) {
        int [] array = {1, 0, 2, 0, 3, 0, 4, 0};
        System.out.println("zerosToEnd(array) = " + Arrays.toString(zerosToEnd(array)));
    }

    public static int[] zerosToEnd(int [] array){
        int count =0; // count of non zero elements

        for (int i = 0; i < array.length; i++) {
            if(array[i] !=0){
                array[count++]= array[i];
            }
        }
        while (count <array.length){
            array[count++]=0;
        }
        return array;




    }
}
