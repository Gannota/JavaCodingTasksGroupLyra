package week02;

public class WriteAFunction {

    public static void main(String[] args) {

        int n = 24;

     number(n);

    }


    public static void number (int n){
        for (int i = 1; i < n; i++) {
         String result = "";

            if (i % 2 == 0){
                result += "Cordiality";
            }
            if ( i % 3 == 0 ){
                result += "Test";
            }

            if ( i % 5 == 0){
                result += "Coder";
            }

            if (result.equals("")){
                result =Integer.toString(i);
            }

            System.out.println(result);

        }

    }


}


/*
Numbers print consecutive numbers
Write a function:
that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line. However, any number
divisible by 2, 3 or 5 should be replaced by the word Cordiality, Test or Coders respectively. If a number is divisible by more than
one Of the numbers: 2,3 or 5, it should be replaced by a concatenation Of the respective words Codility, Test and Coders in this
given order. For example, numbers divisible by both 2 and 3 should be replace by CordialityTest and numbers divisible by all
three numbers: 2,3 and 5, should be replaced by CordialityTestC0ders.
example, here is the output for N - 24:
1
Codility
Test
Codility
Coders
CodilityTest
7
Codility
Test
Codi 1 ityCoders
11
CodilityTest
13
Codility
TestCoders
Codility
17
 */