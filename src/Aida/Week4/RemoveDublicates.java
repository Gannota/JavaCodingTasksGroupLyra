package Aida.Week4;

public class RemoveDublicates {
    public static String removeDublicates(String str) {

        String result = "";
        for (int i=0;
        i < str.length();
        i++){
            if (!result.contains("" + str.charAt(i))) {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeDublicates("AAABBBCCC"));
    }
    /*
    String - Remove Duplicates
Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
     */
    }
