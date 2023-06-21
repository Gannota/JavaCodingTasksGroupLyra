package Deonis.Week_5;

public class Reverse_string {

    public static void main(String[] args) {

        System.out.println(reverse("ABCD"));
    }

    public static String reverse(String str){
        String reverse = "";

        for(int i = str.length() - 1 ; i >= 0; i-- ){
            reverse += str.charAt(i);
        }

        System.out.println("Reversed version of string is:");
        return reverse;
    }


}
    /*
    2. Reverse:
  Write a return method that can reverse String.
  Ex: Reverse("ABCD"); ==> DCBA
     */

