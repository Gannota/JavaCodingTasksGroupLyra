package week02;

public class NumbersSwapNumbers {

    public static void main(String[] args) {

//Numbers Divisible by 3
        for (int i = 1; i <= 100 ; i++) {
            if (i % 3 == 0){
                System.out.println("Divisible by 3 : " + i);
            }
        }


        System.out.println("------------------------------------------------------------");

        //Numbers Divisible by 5
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0){
                System.out.println("Divisible by 5 : " + i);
            }
        }

        System.out.println("---------------------------------------------------------------");

        //Numbers Divisible by 15
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0){
                System.out.println("Divisible by 15 : " + i);
            }
        }



        System.out.println("---------------------------------------------------");

        //Numbers Divisible by 3, 5, 15
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 15 == 0){
                System.out.println("Divisible by 3  or  5 or 15: " + i);
            }
        }



    }
}





/*
Numbers Swap Numbers
Swap two variable' values without using a third variable
Numbers Divisible by 3, 5, 15
Write a program that can print the numbers between 1 — 100 that can be divisible by 3, 5, and 15.
if the number can be divisible by 3, 5 and 15, then it should only be displayed in DivisibelBy15' section
if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibelBy3' section
if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in DivisibelBy5' section
Output:
Divisible By 15 15 3045 60 75 90
Divisible By 5 5 10 2025 35 40 50 55 65 7080 85 95 100
Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 4248 51 54 57 6366 69 72 78 84 8793 96 99
 */

