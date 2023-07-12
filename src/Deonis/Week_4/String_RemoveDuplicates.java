package Deonis.Week_4;

public class String_RemoveDuplicates {

    public static void main(String[] args) {

        removeDuplicates("AAABBBCCC");

    }

    public static String removeDuplicates(String str){
        String result = "";


        for (int i = 0; i < str.length(); i++) {

            if( result.contains( ""+str.charAt(i) )){ // if the character is already contained in new string
                continue; // skip it
            }

            result += str.charAt(i);

        }

        System.out.println(result);

        return result;


    }
}
