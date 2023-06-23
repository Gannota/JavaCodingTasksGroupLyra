package Oyu.week5;

public class FindUnique {
    public static void main(String[] args) {
        //0123456789
        System.out.println("uniqueChar(\"AAABBBCCCDEF\") = " + uniqueChar("AAABBBCCCDEF"));

        String str = "ABCA";
        System.out.println("str.indexOf(A) = " + str.indexOf("B"));
        System.out.println("str.lastIndexOf(A) = " + str.lastIndexOf("B"));

    }

    public static String uniqueChar(String str) {
        String unique ="";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);      // string element into char
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                unique += ch;             // char element to string by adding empty string
            }
        }

        return unique;

    }
}
