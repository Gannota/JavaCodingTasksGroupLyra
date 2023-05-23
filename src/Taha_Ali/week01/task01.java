package Taha_Ali.week01;

public class task01 {


    public static void main(String[] args) {

        System.out.println(identify(6));
        System.out.println(identify(5));


    }

    public static String identify (int num){
      if ( num <= 0){
          System.err.println("Invalid number :" + num);
          System.exit(1);
      }
        String result = "";
        if (num %2 ==0){
            result= "Even";
        }else {
            result = "Odd";
        }

        return result;

    }



}
