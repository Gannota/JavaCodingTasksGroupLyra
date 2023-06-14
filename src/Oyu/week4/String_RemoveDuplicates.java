package Oyu.week4;

import java.util.Arrays;
import java.util.TreeSet;

public class String_RemoveDuplicates {
    /*
    Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
     */

    public static void main(String[] args) {
        System.out.println("removeDup(AAABBBCCC) = " + removeDup("AAABBBCCC"));
        System.out.println("removeDup1(\"AAABBBCCC\") = " + removeDup1("AAABBBCCC"));


    }

    public static String removeDup(String str) {
        String nonDup = "";
        for (int i = 0; i < str.length(); i++) {
            if (!nonDup.contains("" + str.charAt(i))) {
                nonDup += "" + str.charAt(i);
            }
        }

        return nonDup;
    }

    public static String removeDup1(String str) {
        str = new TreeSet<String>(Arrays.asList(str.split(""))).toString();
        str = str.replace(", ", "").replace("[", "").replace("]", "");
        return str;


    }
}
