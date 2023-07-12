package Daadman.week2;

public class DivisibleBy3_5_15 {


    public static void main(String[] args) {


        /*

        Numbers -- DIvisible by 3,5,15

        Write a program that can print the nunbers between 1 ~ 100 that can be divisible by 3,5, and 15.
            if the number can be divisible by 3, 5, and 15, then it should only be displayed in DivisibleBy15 section.
            if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in DivisibleBy3 Section

            if the number can be divisible by 5, but cannot be divisible by 15, then it should only be displayed in DivisibleBy5' section.

            ex:
            Output:
             Divisble By 15: 15 30 45 60 75 90
             Divisible By 3: 3 6 9 12 18 21 24 27 33 ... 99
             Divisible by 5: 5 10 20 25 35 40 50 55 65 70 80 85 95 100


         */


        String By15 = "Divisible by 15:",
                By3 = "Divisible by 3: ",
                By5 = "Divisible by 5: ";



        for (int number = 1; number <= 100; number++) {

            if (number % 3 == 0 && number % 5 == 0 && number % 15 == 0) {
                By15 += " " + number;
            } else if (number % 3 == 0 && number % 15 != 0) { // the numbers that divide by 15 are not included
                By3 += " " + number;

            } else if(number % 5 == 0 && number % 15 != 0){// the numbers that divide by 15 are not included
                By5 += " " +number;

            }

        }


        System.out.println(By15);
        System.out.println(By3);
        System.out.println(By5);



/*

        for (int numbers = 1; numbers <= 100; numbers++){

            if( numbers % 15 == 0 && numbers % 3 ==0 && numbers % 5 == 0) {

                System.out.print("Divisible By 15: " + numbers);
            }
            if ( numbers % 3 == 0 && numbers % 15 != 0){
                System.out.println("Divisible By 3: " + numbers);
            }
            if (numbers % 5 == 0 && numbers % 15 != 0){
                System.out.println("Divisible By 5: " + numbers);
            }

            }

 */


        }
    }

