package Oyu.Interview;

public class Task14DivideTwoNumbers {
    /*
   Write a method that can divide two numbers without using
division operator /
     */
    public static void main(String[] args) {
        divideTwoNumbers(70,30);
        //3.33


    }
/*
    public static void divideTwoNumbers(int num1, int num2) {

        // assuming num1=100 is dividend and num2=50 is divisor: Divisor cant be zero
        if (num2 == 0) {
            System.out.println("Divisor cant be zero");
            return;
        }
        System.out.println(num1 + " divided by " + num2 + " is:");

        int count = 0;
        while (num1 >= num2) { //100>50
            num1 -= num2;  //100-50=50, 50-50=0
            count++;      // count =2
        }                   //2                          0
        System.out.println(count + " and remainder is " + num1);


    }

 */

    public static void divideTwoNumbers(int num1, int num2){

        // asuming num 1 is divident and num2 divisor
        // 100 / 50

        if(num2==0){
            System.out.println("Divisor cant be zero");
            return;
        }
        System.out.println(num1 + " divided by " + num2 +" is:");


        int count =0;
        while (num1>=num2){

            num1-=num2;  //100 -30 = 70 ; 70-30 =40; 40-30=10
            count++;

        }

        System.out.println(count + " remainder is " + num1);


    }
}
