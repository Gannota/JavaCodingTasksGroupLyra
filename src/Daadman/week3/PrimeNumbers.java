package Daadman.week3;

public class PrimeNumbers {

    public static boolean isPrime(int number){
        if (number <= 1) {
            return false;
        }

        // we check for divisibility from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number) ; i++) {
            if (number % i == 0) {
                return false; // if divisible,  it is composite number
            }

        }
        return true; // if not divisible by any number rather than itslef in the loop.
    }
    public static void main(String[] args) {
        int num = 21;

        if(isPrime(num)){
            System.out.println(num + " is a prime number. ");
        }else {
            System.out.println(num + " is not a prime number. ");
        }


        //Write a method that can check if a number is prime or not



    }
}
