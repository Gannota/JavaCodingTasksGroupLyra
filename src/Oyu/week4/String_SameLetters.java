package Oyu.week4;

import java.util.Arrays;
import java.util.TreeSet;

public class String_SameLetters {
    /*
    Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
     */
    public static void main(String[] args) {

        System.out.println("sameLetters = " + sameLetters("abc", "cab"));
        System.out.println("sameLetters1 = " + sameLetters1("bbc", "bcb"));
    }
    public static boolean sameLetters(String a, String b){

        a= new TreeSet<String>(Arrays.asList(a.split(""))).toString();
        b= new TreeSet<String>(Arrays.asList(b.split(""))).toString();

        return a.equals(b);
    }
    public static boolean sameLetters1(String a, String b){
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String a1 ="";
        String b1 ="";

        for (char each : ch1) {
            a1+= each;

        }
        for (char each : ch2) {
            b1+=each;
        }
        return a1.equals(b1);
    }

}
