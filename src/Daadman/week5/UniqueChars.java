package Daadman.week5;

public class UniqueChars {

    //1. Find the unique:
    //  Write a return method that can find the unique characters from the String.
    //  Ex: unique("AAABBBCCCDEF") ==> "DEF";

    public static String uniqueCharacters(String str) {

        String uniqueChars = "";

        for (int i = 0; i < str.length(); i++) {

            char myChar = str.charAt(i);

            if(str.indexOf(myChar) == str.lastIndexOf(myChar)) {
                uniqueChars += myChar;
            }
        }

        return uniqueChars;
    }

    public static void main(String[] args) {


        System.out.println();
        System.out.println("Ex : unique(\"CCDIBBB LCCCODDDDVFFFEGGG-YUUAJJJWWWKKK\") ==> " + uniqueCharacters("CCDIBBB LCCCODDDDVFFFEGGG-YUUAJJJWWWKKK"));


    }
}
