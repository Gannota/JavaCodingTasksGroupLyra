package Deonis.Week_1;

public class Task1 {

    public static String  identify(int number) {

        String result = "";

        if (number > 0 ){
            if( number % 2 == 0) {
              result = number + " is a even number";
            } else {
               result = number + " is a odd number";
            }
        } else {
            throw new RuntimeException("The number can not be negative or zero" + number);
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(identify(4));

    }
}
/*
Numbers -- odd & Even

Write a method which can identify given number is even or odd

ex:
identify(5) -> "Odd"
identify(6) -> "Even"

 */