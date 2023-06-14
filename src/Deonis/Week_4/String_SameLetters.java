package Deonis.Week_4;

import javax.management.MBeanAttributeInfo;
import java.util.Arrays;

public class String_SameLetters {

    public static void main(String[] args) {



        System.out.println(sameLetters("abc", "cab"));
        System.out.println(sameLetters("abc","abb"));



    }

    public static boolean sameLetters(String str1, String str2) {

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String a1 = "";
        String a2 = "";

        for (char each : ch1)
            a1 += each;

        for (char each : ch2)
            a2 += each;

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        return a1.equals(a2);
    }
}