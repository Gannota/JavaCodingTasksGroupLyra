package Aida.Week2;

public class Devisible_by_3_5_15 {
    public static void main(String[] args) {

     /*  int number = 65;

        boolean devisibleBy3 = number%3==0;
        boolean devisibleBy5 = number%5==0;
        boolean devisibleBy15=number%15==0;

        System.out.println("--------------------------");

*/
        System.out.println("Divided by 3: ");
        for (int i=1; i<100; i++) {
            if (i%3==0)
                System.out.print(i +", ");
        }

        System.out.println("\nDivided by 5: ");
        for (int i=1; i<100; i++) {
            if (i%5==0) System.out.print(i +", ");
        }

        System.out.println("\nDivided by 3 & 5: ");
        for (int i=1; i<100; i++) {
            if (i%3==0 && i%5==0) System.out.print(i +", ");
        }

        System.out.println("\nDivided by 15: ");
        for (int i =1; i<100; i++){
            if (i%15==0) System.out.println(i +", ");
            }
        }


    }
