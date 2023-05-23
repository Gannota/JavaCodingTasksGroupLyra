package Taha_Ali.week01;

public class task02 {


    public static void main(String[] args) {

        System.out.println(divide(12,3));




    }

    public static int divide( int num1, int num2){
        int result = 0;

        while ( num1 >= num2){
            num1 =  num1 -num2;
            result++;
        }

        return  result;
    }
}
