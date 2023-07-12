package Oyu.Interview;

import java.util.Arrays;
import java.util.TreeSet;

public class SameLetterStringCheck {

    public static void main(String[] args) {

        System.out.println("sameLetter(\"amc\",\"mac\") = " + sameLetter("amc", "mac"));
        System.out.println("sameLetter1(\"abc\",\"cab\") = " + sameLetter1("abc", "cab"));
    }
    public static boolean sameLetter(String a, String b){
/*
Write a return method that check if a string is build out of the same letters as another string.
Ex: same("abc", "cab"); -> true , same("abc", "abb"); -> false:
 */
        char [] arr1 =a.toCharArray();
        char [] arr2 =b.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String a1="";
        String b1="";

        for (char each : arr1) {
            a1 +=each;
        }
        for (char each : arr2) {
            b1 +=each;
        }
        return a1.equals(b1);


    }

    public static boolean sameLetter1(String str1, String str2){
        str1 = new TreeSet<String>(Arrays.asList(str1.split(""))).toString();
        str2 = new TreeSet<String>(Arrays.asList(str2.split(""))).toString();

        return str1.equals(str2);

    }

}
