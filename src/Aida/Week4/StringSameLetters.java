package Aida.Week4;

import javax.xml.stream.events.StartDocument;

public class StringSameLetters {

    public static boolean SameLetter (String str1,String str2){

        String str ="";
        int count=0;

        for(int i=0; i<str1.length();i++){
          for (int j=0; j<str2.length();j++){
              if (str1.charAt(i)==str2.charAt(j)){
                  count++; // when 1st letter ==2nd it's +1 point
                  break; // after first successful compare - stop checking
              }

          }

        }
        return count==str2.length(); // count must be equal to the string length (if it's 10 letters count should be 10, they are always equals)
    }

    public static void main(String[] args) {
        System.out.println(SameLetter("qwerty","rtyewq"));
        System.out.println(SameLetter("qwertu","ytewqr"));
    }

    /*
    ⃣  String - Same letters
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("cab", "cab"); ==> true
      same("abc", "abb"); ==> false
     */
}
