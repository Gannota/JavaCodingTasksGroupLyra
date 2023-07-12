package RomanA.Week6;


public class Password_Validation {

    //1. Password Validation Task:
    //  Write a return method that can verify if a password is valid or not. Requirements:
    public static boolean PasswordValidation(String password){

        int upper = 0;
        int lower = 0;
        int specialChar= 0;
        int digit = 0;

        //    1. Password MUST be at least have 6 characters and should not contain space,
        if (password.length() >= 6 && !password.contains(" ")){
            //    2. Password should at least contain one upper case letter,
            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i))){
                    upper++;

                    //    3. PassWord should at least contain one lowercase letter,
                }else if (Character.isLowerCase(password.charAt(i))){
                    lower++;

                    //    4. Password should at least contain one special characters,
                }else if (!Character.isLetterOrDigit(password.charAt(i))){
                    specialChar++;

                    //  5. Password should at least contain a digit.
                }else if (Character.isDigit(password.charAt(i))){
                    digit++;

                }
            }
        }
        return upper >= 1 && lower >= 1 && specialChar >= 1 && digit >= 1;

        //if all requirements above are met, the method returns true, otherwise returns false.

    }

    public static void main(String[] args) {

        String pass = "oman12111gh@";

        System.out.println(PasswordValidation(pass));



    }



}
