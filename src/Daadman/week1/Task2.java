package Daadman.week1;

public class Task2 {

/*
Numbers -- Divide without / operator

Write a method that can divide two numbers without division operator;

 */

    public static int divideWO_Operator(int dividend, int divisor){

        int quotient = 0;

        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;

        }
        return quotient;
    }

    public static void main(String[] args) {

        System.out.println(divideWO_Operator(15,3));
        System.out.println(divideWO_Operator(45,5));
        System.out.println(divideWO_Operator(300,5));
    }

}
