package Maria.week4;

import java.util.ArrayList;
import java.util.Arrays;

public class SameLetter {

    public static void main(String[] args) {
        System.out.println(same("amor", "roma"));
    }

    public static boolean same(String str1, String str2){
        boolean result = false;
        String [] arr1 = str1.split("");
        String [] arr2 = str2.split("");

        if (str1.length() == str2.length()){
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if (Arrays.equals(arr1, arr2)){
                result = true;
            }
        }
        return result;




    }
}

//Write a return method that checks if a string is built out of the same letters as another string.
//  Ex: same("abc", "cab"); ==> true
//      same("abc", "abb"); ==> false