package Oyu.week5;

public class ReverseString {

    public static void main(String[] args) {

        System.out.println(reverse2("spoon"));
    }

    public static String reverse1(String str){
        String reverse="";

        for( int i = str.length()-1; i >=0; i--){
            reverse+=str.charAt(i);
        }
        return reverse;
    }
    public static String reverse2(String str){

        return  new StringBuffer(str).reverse().toString();

    }

}
