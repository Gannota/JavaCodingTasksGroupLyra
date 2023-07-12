package Daadman.week4;

import java.util.Arrays;

public class SameCharacters {

    // Write a return method that checks if a string is built out of the same letters as another string.
    //  Ex: same("abc", "cab"); ==> true
    //      same("abc", "abb"); ==> false

    public static boolean isSameChars(String str1, String str2){

        // Convert the strings to lowercase to ignore case sensitivity
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();


        // Convert the strings to character arrays and sort them
        str1 = str1.replaceAll("\\s", "");
        str2 = str2.replaceAll("\\s","");

        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        String string1 = "", string2 = "";

        for(char each : array1){
            string1+= each;
        }

        for(char each : array2) {
            string2+= each;
        }

        return string1.equals(string2);


    }

    public static void main(String[] args) {

        System.out.println(isSameChars("abc", "bca"));
        System.out.println(isSameChars("reodr", "order"));
        System.out.println(isSameChars("cab", "CAB"));
        System.out.println(isSameChars(" b a c    ", "CAB"));


    }

}
