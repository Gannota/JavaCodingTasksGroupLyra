package Oyu.week5;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println("reverse1(\"abcd\") = " + reverse1("abcd"));
    }

    public static String reverse1(String str){
        String reverse="";

        for( int i = str.length()-1; i >=0; i--){
            reverse+=str.charAt(i);
        }
        return reverse;
    }

}
