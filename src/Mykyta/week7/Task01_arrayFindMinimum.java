package Mykyta.week7;

public class Task01_arrayFindMinimum {

    public static void main(String[] args) {

        int[] example = {21,23,3,34,5,1,0,100};

        System.out.println(findMin(example));

    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

}

/*
1. Array - Find Minimum
  Write a method that can find the minimum number from an int Array

 */