package Deonis.Week_3;

public class PrimeNumber {

    public static boolean isPrime(int num) {
        if ((num % 3 == 0)||(num % 2 == 0)) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {

        System.out.println(isPrime(1));

    }

}
/*
Write a method that can check if a number is prime or not
 */



