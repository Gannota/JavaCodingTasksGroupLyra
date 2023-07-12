package Daadman.week5;

public class ReverseChars {

    //2. Reverse:
    //  Write a return method that can reverse String.
    //  Ex: Reverse("ABCD"); ==> DCBA

    // Solution 1:
    public static String reverseStr1(String str) {
        String reversed = "";

        for (int i = str.length()-1; i >=0 ; i--) {

            reversed+=str.toCharArray()[i];

        }
        return reversed;
    }


    // Solution 2:
    public static String reverseStr2(String str) {

        String reversed = "";

        for (int i = str.length()-1; i >=0 ; i--) {

            reversed = reversed + str.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        System.out.println("(\"DESREVER\") ==> " + reverseStr1("DESREVER"));
        System.out.println("(\"DESREVER\") ==> " + reverseStr2("DESREVER"));
    }


}
