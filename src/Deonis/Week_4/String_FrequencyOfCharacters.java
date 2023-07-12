package Deonis.Week_4;

public class String_FrequencyOfCharacters {

    public static void main(String[] args) {

        frequencyOfChars("AAABBCDD");


    }

    public static String frequencyOfChars(String str) {

        String result = "";


        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); // each character from string
            int count = 0;

            for (int i = 0; i < str.length(); i++) { //to find the frequency of each character

                char each = str.charAt(i); // each character of str
                if(ch == each){
                    count++;
                }
            }

            if(result.contains(""+ch)){
                continue;
            }

            result += ch;
            result += count;
        }


        System.out.println(result);




        return result;
    }
}


