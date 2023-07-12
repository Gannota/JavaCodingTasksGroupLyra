package Oyu.Interview;

public class Task3UniqueCharacters {
//    Write a return method that can find the unique characters from the String
//    Ex: unique("AAABBBCCCDEF") ==> "DEF";

    public static void main(String[] args) {
                                                                             //0123456789
        System.out.println("uniqueChar(\"AAABBBCCCDEF\") = " + uniqueChar("AAABBBCCCDEF"));
        String str = "ABCA";
      System.out.println("str.indexOf(A) = " + str.indexOf("B"));
       System.out.println("str.lastIndexOf(A) = " + str.lastIndexOf("B"));

    }
    public static String uniqueChar(String str){
        String unique="";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // string element into char
            if(str.indexOf(ch)==str.lastIndexOf(ch)){
                unique+=ch; // char element to string by adding empty string
            }
        }

        return unique;

    }




}

/*
    public static String uniqueChar(String str){
        String unique="";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(str.indexOf(ch)==str.lastIndexOf(ch)){
                unique+=""+ch;
            }
        }


        return unique;
    }
}
 */

