package Mykyta.week4;

public class Task1_StringFrequencyOfCharacters {

    //Write a return method that can find the frequency of characters
    //  Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2

    public static void main(String[] args) {

        System.out.println(frequencyOfChars("CCCYYDDDEEOOO"));

    }

    public static String frequencyOfChars(String str) {

        String nonDup = "";

        for (int i = 0; i < str.length(); i++) {
            if(!nonDup.contains("" + str.charAt(i))) {
                nonDup += str.charAt(i);
            }
        }

        String expectedResult = "";

        for (int j = 0; j < nonDup.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if(nonDup.charAt(j) == str.charAt(i)) {
                    count++;
                }
            }

            expectedResult += nonDup.charAt(j) + "" + count;
        }

        return expectedResult;

    }

}
