package Deonis.interview;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_19 {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,3,4,45,100,234,1256,100));
        ArrayList<Integer> list2 = new ArrayList<>();

        for (Integer each:list1) {
            if (each <= 100){

                list2.add(each);

                list1=list2;



            }

        }
        System.out.println(list1);





    }

}






/*
19. Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.
 */