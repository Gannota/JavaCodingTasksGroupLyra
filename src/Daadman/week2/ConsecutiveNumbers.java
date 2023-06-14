package Daadman.week2;

import java.util.ArrayList;
import java.util.Arrays;

public class ConsecutiveNumbers {


    public static void main(String[] args) {



        /*
   Write function that, given a positive integer N, prints the consecutive numbers from 1 to
N, each on a separate line. However, any number divisible by 2, 3 or 5
should be replaced by the word Codility, Test or Coders respectively. If a
number is divisible by more than one of the numbers: 2,3 or 5, it should be
replaced by a concatenation of the respective words Codility, Test and
Coders in this given order. For example, numbers divisible by both 2 and 3
should be replacée by CodilityTest and numbers divisible by all
three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.
     */
        int N = 30;

        String result ="";

        for (int i = 0; i <= N ; i++) {
            if(i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                result += "CodilityTestCoders\n";
            } else if(i % 2 == 0 && i % 3 == 0) {
                result += "CodilityTest\n";
            } else if(i % 2 == 0 && i % 5 == 0) {
                result += "CodilityCoders\n";
            } else if(i % 3 == 0 && i % 5 == 0){
                result += "TestCoders\n";
            }else if(i % 2 == 0) {
                result += "Codility\n";
            } else if(i % 3 == 0) {
                result += "Test\n";
            } else if (i % 5 == 0) {
                result += "Coders\n";
            } else {
                result += i + "\n" ;
            }

        }
        System.out.println(result);

        /*
         public static void main(String[] args) {

        for (int i = 1; i <= 24; i++) {
            String result = (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) ? "CodilityTestCoders" : (i % 2 == 0 && i % 3 == 0) ? "CodilityTest" : (i % 2 == 0 && i % 5 == 0) ? "CodilityCoders" : (i % 3 == 0 && i % 5 == 0) ? "TestCoders" : (i % 2 == 0) ? "Codility" : (i % 3 == 0) ? "Test" : (i % 5 == 0) ? "Coders" : i + "";

            System.out.println(result);

        }

    }
         */

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list.addAll(list);


        System.out.println(list);

        System.out.println("----------------------------------");

        ArrayList<String>   names = new ArrayList<>();
        names.addAll(Arrays.asList("Apples", "Bananas", "Oranges"));
        names.addAll(names);

        System.out.println(names);

    }
}
