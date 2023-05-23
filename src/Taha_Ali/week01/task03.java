package Taha_Ali.week01;

public class task03 {

    public static void main(String[] args) {


        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0 &&  i % 5 == 0){
                System.out.println("FinRa");
            } else if (i % 3 == 0) {
                System.out.println("Fin");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            }else {
                System.out.println(i);
            }
        }

    }
    
}
