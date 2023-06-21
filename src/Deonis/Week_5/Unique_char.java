package Deonis.Week_5;

public class Unique_char {

    public static void main(String[] args) {

        System.out.println(unique_chars("AAABBBCCCDEF"));

    }

    public static String unique_chars(String str) {

        String unique = "";

        for (int i = 0; i < str.length(); i++) { // i: index numbers of str
            char each = str.charAt(i);

            if (str.indexOf(each) == str.lastIndexOf(each)) {
                unique += each;

            }

        }
        System.out.println("Unique characters are: ");
        return unique;


    }
}

/*
1. Find the unique:
  Write a return method that can find the unique characters from the String.
  Ex: unique("AAABBBCCCDEF") ==> "DEF";
 */