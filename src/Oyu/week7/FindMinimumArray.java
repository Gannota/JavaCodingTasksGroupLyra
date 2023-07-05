package Oyu.week7;

import java.util.ArrayList;

public class FindMinimumArray {
    public static int findMin(ArrayList<Integer> a) {
        int min =Integer.MAX_VALUE;
        for(int each: a)
            min = Math.min(min, each);
        return min;
    }
}
