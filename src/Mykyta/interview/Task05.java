package Mykyta.interview;

public class Task05 {

    public static void main(String[] args) {

        System.out.println(FrequencyOfChars("aaadddsss"));

    }

   /* public static String FrequencyOfChars(String str) {
        String nonDup = "";

        for (int i = 0; i < str.length(); i++) {
            if(!nonDup.contains(""+str.charAt(i))) {
                nonDup+="" +str.charAt(i);
            }
        }

        String expectedResult = "";

        for (int j = 0; j < nonDup.length(); j++) {
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == nonDup.charAt(j)) {
                    count++;
                }
            }
            expectedResult += nonDup.charAt(j) + "" + count;
        }

        return expectedResult;
    }*/
    public static String FrequencyOfChars(String str) {

        String nonDup = ""; // Creating new String for Non Duplicated chars



        for (int i = 0; i < str.length(); i++) { // regular loop to go through each char of str
            if(!nonDup.contains("" + str.charAt(i))) { //check if nonDub doesn't contain current char from str
                nonDup += str.charAt(i); // add current char to non dup.
            } // in result, we have a string with non duplicated elements
        }

        String expectedResult = ""; // initialize empty string for result

        for (int j = 0; j < nonDup.length(); j++) { // iterate each char from nonDup
            int count = 0; // initialize empty variable to count appearances
            for (int i = 0; i < str.length(); i++) { // nested loop to iterate
                if(str.charAt(i) == nonDup.charAt(j)) {
                    count++;
                }

            }
            expectedResult +=nonDup.charAt(j)+"" + count;
        }

        return expectedResult;

    }


}
/*
5. Write a return method that can find the frequency of characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
