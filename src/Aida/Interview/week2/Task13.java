package Aida.Interview.week2;

public class Task13 {

    public static void main(String[] args) {
        System.out.println(isOdd1(500));
        System.out.println(isOdd2(451));
        System.out.println(isEven1(254));
    }

    public static boolean isOdd1(int num) {        //solution1
        return (num % 2 == 0) ? false : true;

    }

    public static String isOdd2(int number) {             //solution2
        String result = "";

        if (number % 2 != 0) {
            result = "Odd";
        } else {
            result = "Even";
        }
        return result;
    }

        public static String isEven1(int num1)  {                  // solution3
        return (num1%2==0)?"Even":"Odd";
        }
}


    
/* Write a method which can identifies given number is even or  /*
odd  /*
EX:  /*
identify(5) -> "Odd"  /*
identify(6) -> "Even"  /*

/*
    13. Write a method which can identifies given number is even or
    odd
   EX:
    identify(5) -> "Odd"/*public static void main(String[] args) {
    identify(6) -> "Even"    System.out.println("The number is" + isOdd(50));
    Solution:    System.out.println(isODd(41));
    public static String identifyOddEven( int n ) {}
    return n%2==0 ? "Even" : "odd" ;
    }   public static String isOdd(int num){
        return (num%2==0)?"Even":"Odd";
       }
       public static boolean isEven(int num){
        return (num%2==0)?true:false;
           }
           public static boolean isODd(int num){
        return !isEven(num);
           }

           public static String isOdd(int num){
        if (isOdd(40)){
            System.out.println("The number is Odd");
        }els

           }
    }

           */

