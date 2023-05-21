package Oyu.week1;

public class Task3 {

    public static void FINRA(int number) {


        if (number % 15 == 0) {
            System.out.println("FINRA");
        } else if (number % 3 == 0) {
            System.out.println("FIN");
        } else if (number % 5 == 0) {
            System.out.println("RA");
        } else if (number <= 0 || number > 30) {
            System.err.println("Method accepts numbers from 1 to 30 only: " + number);
            System.exit(1);
        } else {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        FINRA(6);
    }
}
/*
FINRA :
Write
a method which prints out the numbers from 1 to 30 but for numbers which
are a multiple of 3 print "FIN" instead of the number and for numbers which are a
multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
both 3 and 5, print "FINRA" instead of the number.
 */