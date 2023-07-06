package Mykyta.interview;

import java.util.ArrayList;
import java.util.*;

public class Task18_RemoveNames {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed","Ahmed","Ahmed"));

        /* Solution 1
        names.removeAll(Arrays.asList("Ahmed"));
         */

        // Solution 2
        ArrayList<String> names2 = new ArrayList<>(); //create new empty ArrayList

        names.forEach(p->{
            if(!p.equals("Ahmed")){
                names2.add(p);
            }
        });

        System.out.println(names2);

        // Solution 3
        names.removeIf(p-> (p.equals("Ahmed")));
        System.out.println(names);

    }


}
/*
18. Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed
 */