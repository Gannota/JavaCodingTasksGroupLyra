package Oyu.Interview;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicate {
   /*
   Write a return method that can remove the duplicated values
from String
Ex: removeDup("AAABBBCCC") ==> ABC
    */

    public static void main(String[] args) {
        System.out.println("removeDup1(\"AAABBBCCC\") = " + removeDup1("AAABBBCCC"));
    }
    public static String removeDup1(String str1){

        str1 = new LinkedHashSet<String>(Arrays.asList(str1.split(""))).toString();
        str1 = str1.replace(",","").replace("[","").replace("]","");
        return str1.trim();
    }
    public static String removeDup2(String str2){
        String result="";
        for (int i =0; i<str2.length();i++){
            if(!result.contains(""+str2.charAt(i))){
                result+=str2.charAt(i);
            }
        }
        return result;
    }



}
