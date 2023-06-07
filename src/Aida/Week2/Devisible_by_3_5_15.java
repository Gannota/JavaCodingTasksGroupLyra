package Aida.Week2;

public class Devisible_by_3_5_15 {
    public static void main(String[] args) {

        int number = 65;

        boolean devisibleBy3 = number%3==0;
        boolean devisibleBy5 = number%5==0;
        boolean devisibleBy15=number%15==0;

        if (number%3==0){
            System.out.println("the number is devisible by 3");
        } else if (number%5==0) {
            System.out.println("the number is devisible by 5");
        }else if(number%15==0){
            System.out.println("the number is devisible by 15");
        }else{
            System.out.println("the number is not devisible by 3,5,15");
        }
    }
}
