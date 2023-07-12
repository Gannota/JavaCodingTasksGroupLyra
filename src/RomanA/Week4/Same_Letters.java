package RomanA.Week4;

public class Same_Letters {


    public static boolean sameLetters(String str1, String str2){


        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {

                if (str1.charAt(i) == str2.charAt(j)){
                    count++;
                    break;  //after first matching breaking loop, to avoid count duplicates
                }
            }
        }
        // sizes have to be equal
        return count == str2.length();


    }

    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "acb";
        System.out.println(sameLetters(str1,str2));

    }
}
