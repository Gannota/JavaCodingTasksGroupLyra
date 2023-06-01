package Oyu.Week2;

public class DivisibleByThreeFiveFifteen {
/*
Write program that can print the numbers between 1~100 that can divisible by3,5,15.
if the number can be divisible by 3,5, and 15 then it should only displayed in DivisibleBy15 section
if the number can be divisible by 3, but can not be divisible by 15 then it should only displayed in DivisibleBy3 section
if the number can be divisible by 5, but can not be divisible by 15 then it should only displayed in DivisibleBy5 section
 */


    public static void main(String[] args) {
        String by15 ="Divisible By 15",
                by5="Divisible By 5",
                by3="Divisible By 3";

        for (int num = 1; num < 100; num++) {
            if (num % 3 == 0 && num % 15 != 0) {
                by3 +=num;
            } else if (num % 5 == 0 && num % 15 != 0) {
                by5 +=num;
            } else if (num % 15 == 0) {
               by3+=num;
            }
        }
    }

}