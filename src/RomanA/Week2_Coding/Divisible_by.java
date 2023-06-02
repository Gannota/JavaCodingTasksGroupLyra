package RomanA.Week2_Coding;

public class Divisible_by {

    public static void main(String[] args) {

        System.out.print("Divisible by 15 = ");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i %5 ==0 && i % 15 == 0){
                System.out.print(i+ " ");
            }
        }
        System.out.println();

        System.out.print("Divisible by 3 = ");
        for (int i = 1; i <= 100 ; i++) {
            if (i % 3 ==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.print("Divisible by 5 = ");
        for (int i = 1; i <= 100 ; i++) {
            if (i % 5 == 0){
                System.out.print(i+ " ");
            }

        }
        System.out.println();
        System.out.println("========================================");

        String divisibleBy15 = "";
        String divisibleBy3 = "";
        String divisibleBy5 = "";

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0){
                divisibleBy15 += i + " ";
            }else if(i % 3 == 0){
                divisibleBy3 += i + " ";
            }else if ( i% 5 == 0){
                divisibleBy5 += i + " ";
            }

        }
        System.out.println("Divisible by 15 = "+ divisibleBy15);
        System.out.println("Divisible by 3 = " + divisibleBy3);
        System.out.println("divisibleBy5 = " + divisibleBy5);



    }
}
