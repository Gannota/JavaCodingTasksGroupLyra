package Daadman.week6;

public class PasswordValidation {

    /*
    1. Password Validation Task:
  Write a return method that can verify if a password is valid or not. Requirements:
    1. Password MUST be at least have 6 characters and should not contain space,
    2. Password should at least contain one upper case letter,
    3. PassWord should at least contain one lowercase letter,
    4. Password should at least contain one special characters,
  5. Password should at least contain a digit.

if all requirements above are met, the method returns true, otherwise returns false.
     */

    public static boolean isValidPassword(String password){

        // Requirement 1: Password must have at least 6 characters and should not contain space
        if(password.length() < 6 || password.contains(" ")) {
            return false;
        }

        // Requirement 2: Password should contain at least one upper case letter
        //if(!password.contains("A-Z")) {
        if(!password.matches(".*[A-Z].*")) {
            return false;

        }

        // Requirement 3: Password should contain at least one lower case letter

        if(!password.matches(".*[a-z].*")){
        //if(!password.contains("a-z")){
            return false;
        }

        // Requirement 4: Password should contain at least one special character

        if(!password.matches(".*[!@#$%^&*()-+=~`{}\\\\|:;\"'<>,.?/].*")){
            return false;


        }

        // Requirement 5: Password should contain at least one digit

        if(!password.matches(".*\\d.*")){
            return false;
        }
        // All requirements are met
        return true;
    }

    public static void main(String[] args) {

        String passWord = "Abc@123";
        boolean isValid = isValidPassword(passWord);
        System.out.println("Is the passWord valid? " + isValid);

    }
}
