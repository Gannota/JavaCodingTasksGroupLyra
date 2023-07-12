package Oyu.week4;

public class String_FrequencyOfCharacters {
    // Write a return method that can find the frequency of character
    // Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2

    public static void main(String[] args) {
        System.out.println("frequencyOfChar = " + frequencyOfChar("AAABBCDD"));


    }

    public static String frequencyOfChar(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }
            if (result.contains("" + ch)) { // if the character is already included in the result
                continue;           // skip that character
            }
            result += "" + ch + count;

        }

        return result;

    }

}
