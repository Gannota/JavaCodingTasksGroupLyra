package Mykyta.week6;

import java.util.regex.*;

public class Task01_password_validation_task {

    public static void main(String[] args) {

        String str1 = "Geeks@portal120";

        System.out.println(passwordValidation1(str1));

        System.out.println("--------");

        String str2 = "qQ123#$%wqwWWW12324r";

        System.out.println(passwordValidation2(str2));

    }

    public static boolean passwordValidation1(String pass) {

        //RegEx - Regular Expression

        // Regex to check valid password
        String regex = "^(?=.*[0-9])" + //^ - character of the string, check numbers
                "(?=.*[a-z])(?=.*[A-Z])" + //check characters lowercase and uppercase
                "(?=.*[@#$%^&-+=()])" + //check given special chars
                "(?=\\S+$).{8,20}$"; //white spaces and length 8-20

        //compile the ReGex
        Pattern p = Pattern.compile(regex);

        //If password is empty, return null
        if(pass == null) {
            return false;
        }

        //Pattern class contains matcher() method
        //to find matching between given password
        //and regular expression
        Matcher m = p.matcher(pass);

        //Return if the password matches the ReGex
        return m.matches();
    }

    public static boolean passwordValidation2(String pass) {

        boolean result = false;

        if(pass.length() >= 6 && !pass.contains(" ")) {
            int upperCase = 0,
                    lowerCase = 0,
                    specialChar = 0,
                    digit = 0;

            for (int i = 0; i < pass.length(); i++) {

                if(pass.charAt(i) >= 48 && pass.charAt(i) <= 57 ) {//digits
                    digit++;
                } else if(pass.charAt(i) >= 65 && pass.charAt(i) <= 90 ) { //upper case
                    upperCase++;
                } else if(pass.charAt(i) >= 97 && pass.charAt(i) <= 122 ) { //lower case
                    lowerCase++;
                } else if(pass.charAt(i) >= 35 && pass.charAt(i) <= 38 ) { //special char
                    specialChar++;
                }
            }

            if(upperCase >= 1 && lowerCase >= 1 && specialChar >= 1 && digit >= 1) {
                result = true;
            } else {
                System.err.println("Password doesn't meet requirements!");
                System.exit(1);
            }

        }

        return result;
    }

}
//1. Password Validation Task:
//  Write a return method that can verify if a password is valid or not. Requirements:
//   + 1. Password MUST be at least have 6 characters and should not contain space,
//    2. Password should at least contain one upper case letter,
//    3. PassWord should at least contain one lowercase letter,
//    4. Password should at least contain one special characters,
//  5. Password should at least contain a digit.
//
//if all requirements above are met, the method returns true, otherwise returns false.