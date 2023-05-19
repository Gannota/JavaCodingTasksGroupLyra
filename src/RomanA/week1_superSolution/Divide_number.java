package RomanA.week1_superSolution;

import java.util.Scanner;

public class Divide_number {

    public static void main(String[] args) {

        System.out.println("Enter first number");

        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();

        System.out.println("Enter second number");
        int num2 = scan.nextInt();

        int result = 0;

        while(num1 >= num2){
            num1 = num1 - num2;
            result ++;

        }



        System.out.println(" Output of dividing 2 numbers is  " + result);



    }
}
