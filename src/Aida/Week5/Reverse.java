package Aida.Week5;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(StReverse("AIDA"));
    }

    public static String StReverse (String str){
        String reverse = "";
        for (int i = str.length()-1; i>=0;i--)
            reverse+=str.toCharArray()[i];
        return reverse;
    }
}
/*


2. Reverse:
  Write a return method that can reverse String.
  Ex: Reverse("ABCD"); ==> DCBA
 */