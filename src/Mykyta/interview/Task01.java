package Mykyta.interview;

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {

        System.out.println(same("abc", "bca"));


    }

    public static boolean same(String str1, String str2) {

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String a1 = "", a2 = "";

        for(char each: arr1) {
            a1+= each;
        }

        for(char each: arr2) {
            a2+= each;
        }

        return a1.equals(a2);


    }

    /* =========================== Solution 2



    public static boolean same(String str1, String str2) {

        str1 = new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
        str2 = new TreeSet<String>(Arrays.asList(str2.split(""))).toString();

        return str1.equals(str2);

    }
    */

    /* =========================== Solution 1
    public static boolean same(String a, String b){
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String a1 = "", a2 = "";

        for(char each : ch1) {
            a1 += each;
        }

        for(char each : ch2) {
            a2 += each;
        }

        return a1.equals(a2);

    }
     */


}
/*
1. Write a return method that check if a string is build out of the same letters as another string.
Ex: same("abc", "cab"); -> true , same("abc", "abb"); -> false:
 */