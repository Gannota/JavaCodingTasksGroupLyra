package Deonis.Week_1;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(divide(16,3));
    }

    public static int divide(int num1, int num2) {
        int result = 0;

        while(num1 >= num2) {
            num1 = num1 - num2;
            result++;
        }


        return result;

    }
}
/*
Numbers -- Divide without / operator

Write a method that can divide two numbers without using division operator
 */