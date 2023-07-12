package Oyu.Interview;

public class Task4ReverseString {

    /*
    Write a return method that can reverse String
     */
    public static void main(String[] args) {

        System.out.println(reverse1("ABCD"));
    }
public static String reverse1(String str){
    String reverse="";
    for( int i = str.length()-1; i >=0; i--){
        reverse+=str.charAt(i);
    }
    return reverse;
}


/*
    public static String reverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse +=str.charAt(i) ;
        }
        return reverse;
    }

 */
    /*


    public static String strReverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.toCharArray()[i];
        }
        return reverse;
    }
 */
    /*
    public static String Reverse(String str) {
        return new StringBuffer(str).reverse().toString();
    }

*/







}




