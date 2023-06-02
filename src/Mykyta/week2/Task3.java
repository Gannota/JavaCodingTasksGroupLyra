package Mykyta.week2;

public class Task3 {
    public static void main(String[] args) {
        Consecutive(17);
    }
    public static void Consecutive(int num) {
        if(num <=0) {
            System.err.println("Number cannot be 0 or negative");
            System.exit(1);
        }
        for (int i = 1; i <= num; i++) {
            if((i % 2 == 0)&&(i % 3 == 0)&&(i % 5 == 0)) {
                System.out.println("CodilityTestCoders");
            } else if((i % 2 == 0)&&(i % 3 == 0)) {
                System.out.println("CodilityTest");
            } else if((i % 2 == 0)&&(i % 5 == 0)) {
            System.out.println("CodilityCoders");
            }else if(i % 5 == 0) {
                System.out.println("Coders");
            } else if(i % 3 == 0) {
                System.out.println("Test");
            } else if(i % 2 == 0) {
                System.out.println("Codility");
            } else {
                System.out.println(i);
            }
        }
    }
}
/*
Numbers -- print consecutive numbers
 */
