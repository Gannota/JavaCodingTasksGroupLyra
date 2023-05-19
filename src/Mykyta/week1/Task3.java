package Mykyta.week1;

public class Task3 {
    public static void main(String[] args) {

        for (int i = 1; i <= 30; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FINRA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else {
                System.out.println(i);
            }
        }

    }
}

/*
FINRA

1-30

num / 3 == FIN
num / 5 == RA
num / 3 && num / 5 == FINRA

 */
