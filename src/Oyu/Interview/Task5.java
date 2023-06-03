package Oyu.Interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Task5 {

    public static void main(String[] args) {

        System.out.println(frequency("AABBBDDDDCCCCCCC"));

        String str = "aaabbbbccccc";
        System.out.println(FeOfChar(str));


    }
    /*
    Write a return method that can find the frequency of
    characters
     */

    public static String FeOfChar(String str) {
        String result = "";
        for (String each : str.split("")) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);
            if (!result.contains(each)) {
                result += each + frequency;
            }
        }


        return result;
    }

    //Solution1
    public static String FrequencyOfChars(String str) {
        String nonDup = "";
        for (int i = 0; i < str.length(); i++)
            if (!nonDup.contains("" + str.charAt(i)))
                nonDup += "" + str.charAt(i);
        String expectedResult = "";
        for (int j = 0; j < nonDup.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == nonDup.charAt(j))
                    count++;
            }
            expectedResult += nonDup.charAt(j) + "" + count;
        }
        return expectedResult;
    }

    //solution2
    public static String FrequencyOfChar(String str) {
        String expectedResult = "";
        int j = 0;
        while (j < str.length()) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            expectedResult += str.charAt(j) + "" + count;
            str = str.replace("" + str.charAt(j), "");
        }
        return expectedResult;
    }

    // solution3
    public static String FrequencyOfCharacter(String str) {
        String b = new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();
        b = b.replace(", ", "").replace("[", "").replace("]", "");
        String result = "";

        for (int j = 0; j < b.length(); j++) {
            int count = 0;

            for (int i = 0; i < str.length(); i++)
                if (str.substring(i, i + 1).equals("" + str.charAt(j)))
                    count++;
            result += b.substring(j, j + 1) + count;
        }
        return result;
    }


    //solution4
    public static String frequency(String str) {
        String nonDup = "", result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!nonDup.contains("" + str.charAt(i)))
                nonDup += "" + str.charAt(i);
        }
        for (int i = 0; i < nonDup.length(); i++) {
            int num = Collections.frequency(Arrays.asList(str.split("")), "" + nonDup.charAt(i));
            result += "" + nonDup.charAt(i) + num;
        }
        return result;
    }
}