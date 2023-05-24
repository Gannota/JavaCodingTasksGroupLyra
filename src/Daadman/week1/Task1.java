package Daadman.week1;

public class Task1 {

public static String  identify(int number) {

String evenOrOdd = "";

if (number > 0 ){
    if( number % 2 == 0) {
    evenOrOdd = "\"Even\"";
    } else {
        evenOrOdd = " \"Odd\"";
    }
} else {
    throw new RuntimeException("Invalid number. the Number: " + number + ", you typed, should not be zero or less");
}
 return evenOrOdd;
}

    public static void main(String[] args) {

        System.out.println(identify(15));
        System.out.println(identify(16));
       //System.out.println(identify(0));
       // System.out.println(identify(-15));
    }
}
