package RomanA.SelfPractice;

public class Utilities {


    public static String FrequencyOfChar(String str) {

        //String str = "";

        String each = "";

        for (int i = 0; i < str.length(); i++) {
            if (!each.contains("" + str.charAt(i))) {
                each += str.charAt(i);
            }
        }
        String finalResult = "";
        for (int j = 0; j < each.length(); j++) {
            int count = 0;


            for (int i = 0; i < str.length(); i++) {
                if (each.charAt(j) == str.charAt(i)) {
                    count++;
                }
            }
            finalResult += each.charAt(j) + "" + count;

        }
        return finalResult;


    }

}








