package Deonis.interview;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task_20 {
    public static void main(String[] args) {
        /*
        20. Given an array of 3 characters print all permutation
        combinations from the given characters
         */
  char [] characters = new char[3];

  characters[0] = '1';
  characters[1] = '2';
  characters[2] = '3';
  printPermutation(characters);





    }
    public static void printPermutation(char[] ch) {
        for(String s: permutation(ch))
            System.out.println(Arrays.toString( s.toCharArray( ) ) );
    }
    public static Set<String> permutation(char[] ch) {
        String str = Arrays.toString(ch).replace(", ", "").replace("[", "").replace("]", "");
        Set<String> set = new LinkedHashSet<>();
        if (str.length() == 1){
            set.add(str);
        }else{
            for (int i=0; i<str.length(); i++){
                String a3 = str.substring(0, i)+ str.substring(i+1);
                char[] ch2 = a3.toCharArray();
                for (String permutation : permutation(ch2))
                    set.add(str.charAt(i) + permutation);
            }
        }
        return set;
    }
}
