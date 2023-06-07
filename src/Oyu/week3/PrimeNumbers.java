package Oyu.week3;

public class PrimeNumbers {
    /*
    Write a method that can check if a number is prime or not
    Prime Number:2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47
     */
    public static void main(String[] args) {

        System.out.println("isPrime(7) = " + isPrime(7));
    }
    public static boolean isPrime(int n){
        for (int i = 2; i < n; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
     /*
        for(int i = 2; i < n; i++){
            the loop starts from 2 and goes until the number n
            we start from 2 because we want to check if the number n is evenly divisible by any number. We dont check for 1 or the number itself because all numbers are evenly divisible by those

            if(n % i == 0){
                this if statement is executed each iteration and checks if the number n is evenly divisible by i. If a number is prime if shouldn't be evenly divisible by any other number. divisibility means when the number is divided there is no left over

               return false;  false is returned whenever the above if statement is true meaning the number n was divisible by a number besides 1 and itself (that is what the loop checks for)

               otherwise true is returned by default at the end of the method
            }
        }
     */
}
