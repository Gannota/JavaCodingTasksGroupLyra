package Aida.Week3;

public class Numbers_PrimeNumber {

    public static void main(String[] args) {
        {
            if (isPrime(2))
                System.out.println(" true");
            else
                System.out.println(" false");
            if (isPrime(30))
                System.out.println(" true");
            else
                System.out.println(" false");
        }
    }
        static boolean isPrime(int n)
        {
            if (n <= 1)
                return false;

            // Check from 5 to n-1
            for (int i = 5; i < n; i++)
                if (n % i == 0)
                    return false;

            return true;
        }
    }
