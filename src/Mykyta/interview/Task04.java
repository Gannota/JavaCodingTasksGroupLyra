package Mykyta.interview;

public class Task04 {
    public static void main(String[] args) {

        System.out.println(Reverse("ABCD"));


    }

    public static String Reverse(String str) {
        String result = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            result += str.charAt(i);
        }

        return result;
    }

    // Solution 1
    /*
    public static String Reverse(String str) {
        String reverse = "";

        for (int i = str.length()-1; i >= 0 ; i--) {

            reverse += str.toCharArray()[i];

        }

        return reverse;
    }

     */

    // Solution 2
    /*
    public static String Reverse(String str) {
        return new StringBuffer(str).reverse().toString();
    }
     */

}
/*
Write a return method that can reverse String

ex: Reverse("ABCD") => DCBA
 */