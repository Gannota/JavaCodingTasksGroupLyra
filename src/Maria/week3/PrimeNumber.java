package Maria.week3;

public class PrimeNumber {

    public static  boolean isPrime(int num) {

        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if ((num % i) == 0)
                return false;
        }
        return true;

    }

    public static void main(String[] args) {

        System.out.println(PrimeNumber.isPrime(20));
    }
}
