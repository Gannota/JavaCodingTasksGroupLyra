package Mykyta.interview;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Task02 {
    public static void main(String[] args) {

        System.out.println(removeDup("aaavvvvvddddaadwdwdwd"));

    }

    public static String removeDup(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if(!result.contains("" + str.charAt(i))){
                result += str.charAt(i);
            }
        }

        return result;
    }





}
/* === Task:

2. Write a return method that can remove the duplicated values from String
Ex: removeDup("AAABBBCCC") ==> ABC

 */

/* === Solution1:
public static String removeDub(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if(!result.contains("" + str.charAt(i))) {
                result += "" + str.charAt(i);
            }

        }

        return result;

    }
 */

/* === Solution2:
 public static String removeDub(String str) {

        str = new LinkedHashSet<String>(Arrays.asList(str.split(""))).toString();
        str.replace(",", "").replace("[", "").replace("]", "");
        return str;

    }
 */