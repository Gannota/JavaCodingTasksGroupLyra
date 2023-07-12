package Daadman.week4;

public class RemoveDuplicates {

   //Write a return method that can remove the duplicated values from the String
   //   Ex: removeDup("AAABBBCCC") ==> ABC

    public static String removeDuplicates (String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if(!result.contains("" + str.charAt(i))) {
                result += " " + str.charAt(i);

            }
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(removeDuplicates("DDDDAAAAMMMMNNNNIIIITTTT"));
        System.out.println(removeDuplicates("DDDDaaaaammmmnnnn iiiitttt!!!!"));
    }


//    public static String removeDuplicates(String input) {
//
//        String result = "";
//
//        input = new LinkedHashSet<String>(Arrays.asList(input.split(""))).toString();
//        input = input.replace(",", "").replace("[","").replace("]","");
//
//        return input;
//    }
//
//    public static void main(String[] args) {
//
//        System.out.println(removeDuplicates("DDDDAAAABBBB"));
//    }

}
