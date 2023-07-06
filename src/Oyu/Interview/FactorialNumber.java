package Oyu.Interview;

public class FactorialNumber {

    /*
    Write a method that returns the factorial of any given number
    ex:
    input:5
    output:120
     */
    public static void main(String[] args) {
        System.out.println("factorial(5) = " + factorial(5));
    }
    public static int factorial(int n){
        int result=1;
        for (int i = 1; i <=n ; i++) {
            result*=i; //  1*1=1;     1*2=2;  2*3=6;     6*4=24;    24*5=120
                       //  i=1;       i=2     =3         i=4        i=5
                       //result=1; result=2; result=6;  result=24   result=120;
        }
        return result;
    }
}
