package Deonis.interview;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_18 {

    public static void main(String[] args) {


        ArrayList<String> names = new ArrayList<>(Arrays.asList("Mykita" , "Oyu" ,"Roman " , "Aida" , "Kamal" ,"Deonis", "Ahmed" ,"Ahmed"));

        names.removeAll(Arrays.asList("Ahmed"));

        System.out.println(names);


    }


}
/*
18. Given a list of people's names: "Ahmed", "John", Eric", "Ahmed".....
Write a java operation to remove all the names named Ahmed

 */
