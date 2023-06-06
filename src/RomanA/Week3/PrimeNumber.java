package RomanA.Week3;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number");
        int num = scan.nextInt();

        boolean prime = false;
        for (int i = 2; i <= num / 2 ; i++) {
            if (num % i == 0){
                prime = true;
                break;
            }
        }
        if (!prime){
            System.out.println(num + " is prime number");
        }else{
            System.out.println(num + " is not prime number");
        }
    }
}
