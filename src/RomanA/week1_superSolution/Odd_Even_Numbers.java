package RomanA.week1_superSolution;

import java.util.Scanner;

public class Odd_Even_Numbers {

    public static void main(String[] args) {

       /* int num = 4;

       if( num %2 == 0){
           System.out.println(num + " is even number");
       }else {
           System.out.println(num + " is odd number");
       }
       */

        Scanner scan = new Scanner(System.in);
       int num1 = scan.nextInt();

       if(num1 %2 !=0){
           System.out.println(num1 + " is odd number");
       }else {
           System.out.println(num1 + " is even number");
       }
       scan.close();

    }
}
