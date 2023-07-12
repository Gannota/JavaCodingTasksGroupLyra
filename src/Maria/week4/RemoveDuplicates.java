package Maria.week4;

public class RemoveDuplicates {

    public static void main(String[] args) {

        System.out.println(removeDup("AABBBBCCCCCCCC")); //ABC
    }

    public static String removeDup(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (!result.contains(ch+"")){
                result += ch;
            }

        }
        return result;
    }
}
//Write a return method that can remove the duplicated values from the String
//  Ex: removeDup("AAABBBCCC") ==> ABC