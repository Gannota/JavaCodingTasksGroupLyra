package Aida.Interview.week1;

import java.util.Arrays;

public class Task12 {

    public static void main(String[] args) {


        int[] N = {-2,1,1,5};

        System.out.println(Arrays.toString(N));
    }
    public static int[ ] Solution(int N ){
        int[ ] result = new int[N];
        int sum = 0;
        for(int i=0; i < N-1; i++) {
            result[i] =i;
            sum += i;
        }
        result[N-1] = -sum;
        return result;
    }
}

