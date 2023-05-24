package Daadman.week1;

public class Task3 {
/*
FINRA:
Write a method which prints out the numbers from 1 - 30, but for numbers that are a muliple of 3, print "FIN" instead of the number and for the numbers which are a multiple of 5, print "RA" instead of the number.
For numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
 */
    public static void main(String[] args) {

        for (int numbers = 1; numbers < 30; numbers++) {
            if(numbers % 3 == 0 && numbers % 5 == 0) {
                System.out.println("FINRA");
            } else if (numbers % 3 == 0) {
                System.out.println("FIN");
            } else if (numbers % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(numbers);
            }
        }
        System.out.println("This was the end of my my first week assignment, thank you for your review!");
    }
}
