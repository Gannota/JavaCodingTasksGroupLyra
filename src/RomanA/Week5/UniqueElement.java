package RomanA.Week5;

public class UniqueElement {

    public static String uniqueElement(String str){

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            if (count == 1){
                result += str.charAt(i);
            }
        }
        return result;

    }

    public static void main(String[] args) {


        System.out.println(uniqueElement("AAABBBCDFBBNNT"));
    }
}
