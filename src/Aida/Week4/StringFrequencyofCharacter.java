package Aida.Week4;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StringFrequencyofCharacter {

    public static String frequencyOfChars(String str) {
        String dop = "";
        for (int i = 0; i < str.length(); i++)
            if (!dop.contains("" + str.charAt(i)))
                dop += "" + str.charAt(i);

        String result = "";

        for (int j = 0; j < dop.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == dop.charAt(j))
                    count++;

            }
            result += dop.charAt(j) + "" + count;
        }
        return result;
    }
    public static void main(String[] args){
             System.out.println(frequencyOfChars("AAABBCDD"));
    }}











/*
public static void main(String[] args) {
        System.out.println(FreqChar("AAABBCDD"));

    }
 */