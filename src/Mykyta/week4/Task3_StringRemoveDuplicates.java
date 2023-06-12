package Mykyta.week4;

public class Task3_StringRemoveDuplicates {

    //Write a return method that can remove the duplicated values from the String
    //  Ex: removeDup("AAABBBCCC") ==> ABC

    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCC"));
    }

    public static String removeDup(String str) {
        String nonDup = "";

        for (int i = 0; i < str.length(); i++) {
            if(!nonDup.contains("" + str.charAt(i))) {
                nonDup += str.charAt(i);
            }
        }

        return nonDup;
    }
}
