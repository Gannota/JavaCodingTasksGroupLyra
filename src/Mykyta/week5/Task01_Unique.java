package Mykyta.week5;

public class Task01_Unique {
    //1. Find the unique:
    //  Write a return method that can find the unique characters from the String.
    //  Ex: unique("AAABBBCCCDEF") ==> "DEF";
    public static void main(String[] args) {

        System.out.println(unique("AAABBBCCCDEF"));

    }

    public static String unique(String str) {

        String[] arr = str.split(""); // crate array of String and store each letter to item

        String unique1 = ""; // empty String for result

        for (int j = 0; j < arr.length; j++) { // iterate through each element
            int num=0; //appearances
            for (int i = 0; i < arr.length; i++) { // iterate each element
                if(arr[i].equals(arr[j])) { // check if only one appearance
                    num++; // increment num variable
                }
            }
            if(num == 1) { // if only 1 appearance
                unique1 += arr[j]; // add current element to the String
            }
        }
        return  unique1; //return result

    }

}
