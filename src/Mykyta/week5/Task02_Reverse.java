package Mykyta.week5;

public class Task02_Reverse {
    //2. Reverse:
    //  Write a return method that can reverse String.
    //  Ex: Reverse("ABCD"); ==> DCBA
    public static void main(String[] args) {

        System.out.println(Reverse("ABCD"));
        System.out.println(Reverse2("ABCD"));

    }

    //Solution 1
    public static String Reverse(String str) {

        String reverse = "";

        for (int i = str.length()-1; i >= 0; i--) {
            reverse += str.toCharArray()[i];
        }

        return reverse;
    }

    //Solution 2
    public static String Reverse2(String str) {
        return new StringBuffer(str).reverse().toString();
    }

}
