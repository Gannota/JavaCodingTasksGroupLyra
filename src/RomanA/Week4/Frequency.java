package RomanA.Week4;

public class Frequency {

    public static String FrequencyOfChar(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if(!result.contains(""+str.charAt(i))){
                result += str.charAt(i);
            }
        }

             String finalResult = "";
        for (int i = 0; i < result.length(); i++) {

            int count = 0;


            for (int j = 0; j < str.length(); j++) {
                if(result.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            finalResult +=result.charAt(i) + "" +count;


        }
        return  finalResult;


    }

    public static void main(String[] args) {


        String bb = "AAABBCDD";

        System.out.println(FrequencyOfChar(bb));
    }

}
