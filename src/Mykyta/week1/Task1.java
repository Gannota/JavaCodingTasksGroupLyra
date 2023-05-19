package Mykyta.week1;

public class Task1 {
    public static void main(String[] args) {

        System.out.println(identify(6));

    }
    public static String identify(int num) {
        String result = "";

        if(num > 0) {
            if(num % 2 == 0) {
                result = "Even";
            } else {
                result = "Odd";
            }
        } else {
            System.err.println("Num cannot be 0 or negative number");
            System.exit(1);
        }




        return result;
    }
}

/*
Numbers -- odd & Even

Write a method which can identify given number is even or odd

ex:
identify(5) -> "Odd"
identify(6) -> "Even"

 */