package Mykyta.week2;

public class Task2 {
    public static void main(String[] args) {
        String by15 = "Divisible by 15:",
                by5 = "Divisible by 5:",
                by3 = "Divisible by 3:";

        for (int i = 1; i <= 100; i++) {
            if((i % 3 == 0)&&(i % 5 == 0)&&(i % 15 == 0)) {
                by15 += " " + i;
            } else if(i % 5 == 0){
                by5 += " " + i;
            } else if(i % 3 == 0) {
                by3 += " " + i;
            }
        }

        System.out.println(by15);
        System.out.println(by5);
        System.out.println(by3);
    }





}

/*
Numbers -- Divisible by 3,5,15


 */