package RomanA.Week4;

public class Duplicates {

    public static String removeDuplicates(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if(!result.contains(""+str.charAt(i))){
                result += str.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(removeDuplicates("AAABBBCCCDFF"));

    }
}
