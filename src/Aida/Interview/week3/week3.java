package Aida.Interview.week3;

import java.util.Scanner;

public class week3 {
    public static void main(String[] args) {

        System.out.println("Enter first number");
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();

        System.out.println("Enter your second number");
        Scanner input1 = new Scanner(System.in);

        int num2 = input.nextInt();

        int result = 0;
        while(num1>=num2){
            num1 = num1-num2 ;
            result++;
        }
        System.out.println(result);


        // new lines needed


    }
}
