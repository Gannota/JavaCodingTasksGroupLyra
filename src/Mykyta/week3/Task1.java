package Mykyta.week3;

public class Task1 {

    public static void main(String[] args) {

        System.out.println(isPrime(1));

    }

    public static boolean isPrime(int num) {
        if ((num % 3 == 0)||(num % 2 == 0)) {
            return false;
        } else {
            return true;
        }
    }

}
/*
Write a method that can check if a number is prime or not
 */