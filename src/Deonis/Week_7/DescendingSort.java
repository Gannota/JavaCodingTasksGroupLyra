package Deonis.Week_7;

import java.util.Arrays;

public class DescendingSort {

    public static void main(String[] args) {


        int[] numbers = {1,9,8,2,7,3,6,4,5};

        System.out.println("descendingSort(numbers) = " + descendingSort(numbers));

    }

    public static String descendingSort(int[] numbers){

        Arrays.sort(numbers);

        int[] reverse = new int[numbers.length];

        for (int i = numbers.length - 1, j=0; i >= 0; i--) {
            reverse[j++]= numbers[i];
        }


        return Arrays.toString(reverse);

    }
}
