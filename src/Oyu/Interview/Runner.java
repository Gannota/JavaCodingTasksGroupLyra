package Oyu.Interview;

public class Runner {

    public static void main(String[] args) {
        System.out.println("Reverse String test started");

      //  System.out.println(Task4.strReverse("ABDC"));
     //   System.out.println(Task4.Reverse("Java"));
    //    System.out.println(Task4.reverse("Wooden Spoon"));

        System.out.println("-----------------------------------------------");

        System.out.println("Frequency of character test started");

        System.out.println(Task5FrequencyOfChar.FrequencyOfChars("HHadddjeee"));
        System.out.println(Task5FrequencyOfChar.FrequencyOfChar("aaaaaaaaaafffffffffffffffggggggggggggggggggg"));
        System.out.println(Task5FrequencyOfChar.FrequencyOfCharacter("AAABBCDD"));
        System.out.println(Task5FrequencyOfChar.frequency("AAABBCDD"));


        System.out.println("------------------------------------------------");

        System.out.println("Valid password test started");

        System.out.println(Task6PasswordValidation.PassWordvalidation("@CydeoSchool2023"));
        System.out.println(Task6PasswordValidation.PassWordvalidation("WoodenSpppon"));

    }
}
