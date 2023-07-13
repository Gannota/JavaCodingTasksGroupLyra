package week02;

public class SwapTwoVariableValues {


    public static void main(String[] args) {

        int a = 20;
        int b = 30;

        System.out.println("Before Swapping : ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);


        System.out.println("---------------------------------------------------------------");

        a = a + b;
        b = b - a;
        a = a - b;

        System.out.println("After Swapping : ");

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}







/*
Swap two variable' values without using a third variable
 */