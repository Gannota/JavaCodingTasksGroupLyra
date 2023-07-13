package Oyu.Interview;

public class Task15FINRA {
/*
Write a method which prints out the numbers from 1 to 30 but
for numbers which are a multiple of 3, print "FIN" instead of the
number and for numbers which are a multiple of 5, print "RA" instead
of the number. for numbers which are a multiple of both 3 and 5, print
"FINRA" instead of the number.
 */
public static void main(String[] args) {
   FINRA();

}
public static void FINRA(){

    String result="";
    for (int i =1; i <=30;i++) {

        result += (i % 3 ==0 && i % 5 ==0)? "FINRA " : (i % 3 ==0)? "FIN ": (i % 5 ==0)? "RA ":  i +" ";

    }

    System.out.println("result = " + result);
}




public static void FINRA1(){
        String result = "";
        for(int i = 1; i<=30; i++){
            if (i % 5==0 && i % 3 ==0){
                result+="FINRA ";
            } else if (i % 5==0) {
                result+="RA ";
            }else if(i % 3==0){
                result+="FIN ";
            }else{
                result += i+" ";
            }

        }
        System.out.println(result);
    }









}
