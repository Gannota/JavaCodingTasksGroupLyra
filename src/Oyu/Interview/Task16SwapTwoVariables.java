package Oyu.Interview;

public class Task16SwapTwoVariables {
    /*
    Swap two variable' values without using a third variable
     */


    public static void main(String[] args) {

        int a = 10 ; int b =20;

        a = a+b; //10=10+20 ==>30
        b=a-b;  //20=30-20 ==>10
        a=a-b;  //30=30-10 ==>20
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
