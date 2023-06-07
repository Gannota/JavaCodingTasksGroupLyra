package Aida.Week1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        int number = 5;
        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

        System.out.println("------------------------");

        System.out.println("Enter your number");

        Scanner input = new Scanner(System.in);

        int number1 = input.nextInt();

        if (number1%2==0){
            System.out.println(number1+ " number is even");
        }else {
            System.out.println(number1 + " number is odd");
        }





    }
}