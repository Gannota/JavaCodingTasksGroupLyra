package Mykyta.interview;

public class Task06_PasswordValidation {

    public static void main(String[] args) {

        System.out.println(passwordValidation("Aa1177w2w2w2w@@"));
        System.out.println("-------");

        System.out.println(passwordValidation2("Aa1177w2w2w2w@@"));

    }

    /*public static boolean passwordValidation(String password) {
        String lowercase="(.*[a-z].*)";
        String uppercase="(.*[A-Z].*)";
        String numbers="(.*[0-9].*)";
        String specialChars="(.*[-/,:-@].*)";

        boolean HasLower = password.matches(lowercase),
                HasUpper = password.matches(uppercase),
                HasDigits = password.matches(numbers),
                HasSpecial = password.matches(specialChars),
                Valid = false;
        if(password.length() >= 6 && !password.contains(" ")) {
            if(HasLower && HasUpper && HasDigits && HasSpecial) {
                Valid = true;
            }
        }
        return Valid;
    }

     */

    public static boolean passwordValidation(String password) {
        String lowercase = "(.*[a-z].*)";
        String uppercase = "(.*[A-Z].*)";
        String numbers = "(.*[0-9].*)";
        String specialChar = "(.*[-/,--@].*)";

        boolean HasLower = password.matches(lowercase),
                HasUpper = password.matches(uppercase),
                HasDigits = password.matches(numbers),
                HasSpecial = password.matches(specialChar),
                Valid = false;

        if(password.length() >= 6 && !password.contains(" ")) {
            if(HasLower && HasUpper && HasDigits && HasSpecial) {
                Valid = true;
            }
        }

        /*
        System.out.println("HasLower = " + HasLower);
        System.out.println("HasUpper = " + HasUpper);
        System.out.println("HasDigits = " + HasDigits);
        System.out.println("HasSpec = " + HasSpecial);

         */

        return Valid;

    }

    public static boolean passwordValidation2(String password) {
        String lowercase = "(.*[a-z].*)";
        String uppercase = "(.*[A-Z].*)";
        String numbers = "(.*[0-9].*)";
        String specialChar = "(.*[-/,--@].*)";

        boolean HasLower = password.contains(lowercase),
                HasUpper = password.matches(uppercase),
                HasDigits = password.matches(numbers),
                HasSpecial = password.matches(specialChar),
                Valid = false;

        if (password.length() >= 6 && !password.contains(" ")) {
            if (HasLower && HasUpper && HasDigits && HasSpecial) {
                Valid = true;
            }
        }


        System.out.println("HasLower = " + HasLower);
        System.out.println("HasUpper = " + HasUpper);
        System.out.println("HasDigits = " + HasDigits);
        System.out.println("HasSpec = " + HasSpecial);



        return Valid;
    }
}

//Write a return method that can verify if a password is valid or not. requirements:
//1. Password MUST be at least have 6 characters and should not contain space
//2. PassWord should at least contain one upper case letter
//3. PassWord should at least contain one lowercase letter
//4. Password should at least contain one special characters
//5. Password should at least contain a digit
//if all requirements above are met, the method returns true, otherwise returns false