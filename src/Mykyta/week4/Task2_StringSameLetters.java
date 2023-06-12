package Mykyta.week4;

public class Task2_StringSameLetters {

    //Write a return method that checks if a string is built out of the same letters as another string.
    //  Ex: same("abc", "cab"); ==> true
    //      same("abc", "abb"); ==> false

    public static void main(String[] args) {

        System.out.println(same("abc", "cba"));

    }

    public static boolean same(String str1, String str2) {
        boolean result = true;
        for (int i = 0; i < str1.length(); i++) {
            int count = 0;
            for (int j = 0; j < str2.length(); j++) {
                if(str1.charAt(i) == str2.charAt(j)) {
                    count++;
                    if(count!=1) {
                        return false;
                    }
                }
            }
        }
        return result;
    }

}
