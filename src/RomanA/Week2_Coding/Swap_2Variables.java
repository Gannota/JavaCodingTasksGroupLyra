package RomanA.Week2_Coding;

public class Swap_2Variables {

    public static void main(String[] args) {


        int num1 = 1;

        int num2 = 2;

        num1 = num1 + num2; // 1 + 2 = 3
        num2 = num1 - num2; //3 - 2 = 1
        num1 = num1 - num2; // 3 - 1 = 2

        System.out.println(num1);
        System.out.println(num2);

    }
}
