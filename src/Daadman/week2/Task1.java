package Daadman.week2;

public class Task1 {
/*
Numbers -- Swap Numbers
Swap two variables' value without usisng a third variable
 */
    public static void main(String[] args) {

        int a = 25;
        int b = 30;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("+================================================");

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);


        /*
        int num1 = 25;
        int num2 = 30;
        System.out.println("num1 = " + num1);
        System.out.println("num2 + " +num2);

        num1 = num1 + num2;// num1 = 55 by reassigning a new value
       num2 = num1 - num2; // = 25. by calculating 55 -30  giving me the orginal value of num1

        num1 = num1 - num2; // a = 55 - 25 = 30 giving me the original value of b


        System.out.println("--------------------------------");

        System.out.println("num1 = " + num1);
        System.out.println("num2 + " + num2);



         */









    }
}
