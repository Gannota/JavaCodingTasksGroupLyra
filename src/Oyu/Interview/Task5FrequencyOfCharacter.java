package Oyu.Interview;

import java.util.Arrays;
import java.util.Collections;


public class Task5FrequencyOfCharacter {
    public static void main(String[]args){
        System.out.println(FreqOfChar("AABBBDDDDCCCCCCC"));


    }
    public static String FreqOfChar(String str) {
        String result = "";
        String nonDup = "";

        for (int i = 0; str.length() > i; i++) {

            if (!nonDup.contains("" + str.charAt(i))) {
                nonDup += "" + str.charAt(i);
            }
        }
        for (int i = 0; nonDup.length() > i; i++) {
            int frequency = Collections.frequency(Arrays.asList(str.split("")), "" + nonDup.charAt(i));
            result += "" + nonDup.charAt(i) + frequency;
        }

        return result;
    }
}