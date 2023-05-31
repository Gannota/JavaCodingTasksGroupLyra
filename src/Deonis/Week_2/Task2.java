package Deonis.Week_2;

public class Task2 {
    public static void main(String[] args) {
        String divisibleBy15 = "Divisible by 15 : ";
        String divisibleBy5 = "Divisible by 5 : ";
        String divisibleBy3 = "Divisible by 3 : ";

        for (int i = 1; i <= 100; i++) {
            if((i % 3 == 0)&&(i % 5 == 0)&&(i % 15 == 0)) {
                divisibleBy15 += i + " ";
            } else if(i % 5 == 0){
                divisibleBy5 += i + " ";
            } else if(i % 3 == 0) {
                divisibleBy3 += i + " ";
            }
        }

        System.out.println(divisibleBy15);
        System.out.println(divisibleBy5);
        System.out.println(divisibleBy3);
    }

}

/*
Numbers -- Divisible by 3,5,15
*/

