package Daadman.interviewTasks;

import java.util.Arrays;

public class Practice11 {

    /*
    11. Write a function:
that, given an integer N (1 < N < 100), returns an array containing
N unique integers that sum up to 0. The function can return any
such array. For example, given N = 4, the function could return
[1,0, -3,2] or [-2,1, -4,5]. The answer [1, -1,1,3] would be incorrect
(because value 1 occurs twice). For N = 3 one of the possible
answers is [-1,0,1] (but there are many more correct answers).

Solution:

     */

    public static int[] solution(int N) {
        int [] result = new int[N];
        int sum = 0;

        for (int i =0; i < N - 1; i++) {
            result[i] = i;
            sum = sum + i;


        }
        result[N-1] = -sum;

        return result;
    }

    public static void main(String[] args) {

        int[] N = {1,-2,1,3};

        System.out.println("Can any One Help Explain this to me??? " + Arrays.toString(N));
    }


    /*
    public static int[] generateZeroSumArray(int N) {
        if (N <= 1 || N >= 100) {
            throw new IllegalArgumentException("N should be between 1 and 100 exclusive.");
        }

        int[] result = new int[N];
        Set<Integer> uniqueIntegers = new HashSet<>();

        // Generate N-1 unique random integers
        for (int i = 0; i < N - 1; i++) {
            int randomInt;

            // Generate a unique random integer that is not already in the set
            do {
                randomInt = getRandomInt(N);
            } while (uniqueIntegers.contains(randomInt));

            uniqueIntegers.add(randomInt);
            result[i] = randomInt;
        }

        // Calculate the last integer to make the sum equal to 0
        int sum = uniqueIntegers.stream().mapToInt(Integer::intValue).sum();
        result[N - 1] = -sum;

        return result;
    }

    private static int getRandomInt(int N) {
        Random random = new Random();
        return random.nextInt(2 * N) - N + 1;
    }

    public static void main(String[] args) {
        int N = 4;
        int[] zeroSumArray = generateZeroSumArray(N);
        System.out.println(Arrays.toString(zeroSumArray));
    }
     */

    /*

Here's an example of a Java function that generates an array of N unique integers that sum up to 0:

java
Copy code
import java.util.*;

public class ZeroSumArrayGenerator {
    public static int[] generateZeroSumArray(int N) {
        if (N <= 1 || N >= 100) {
            throw new IllegalArgumentException("N should be between 1 and 100 exclusive.");
        }

        int[] result = new int[N];
        Set<Integer> uniqueIntegers = new HashSet<>();

        // Generate N-1 unique random integers
        for (int i = 0; i < N - 1; i++) {
            int randomInt;

            // Generate a unique random integer that is not already in the set
            do {
                randomInt = getRandomInt(N);
            } while (uniqueIntegers.contains(randomInt));

            uniqueIntegers.add(randomInt);
            result[i] = randomInt;
        }

        // Calculate the last integer to make the sum equal to 0
        int sum = uniqueIntegers.stream().mapToInt(Integer::intValue).sum();
        result[N - 1] = -sum;

        return result;
    }

    private static int getRandomInt(int N) {
        Random random = new Random();
        return random.nextInt(2 * N) - N + 1;
    }

    public static void main(String[] args) {
        int N = 4;
        int[] zeroSumArray = generateZeroSumArray(N);
        System.out.println(Arrays.toString(zeroSumArray));
    }
}
In this example, the generateZeroSumArray function takes an integer N as input and returns an array of N unique integers that sum up to 0.

First, the function checks if N is within the specified range (1 < N < 100). If the input is invalid, it throws an IllegalArgumentException.

The function creates an array result of size N to store the generated integers. It also creates a Set called uniqueIntegers to keep track of the unique integers generated so far.

The function then enters a loop that generates N-1 unique random integers. It ensures uniqueness by repeatedly generating a random integer and checking if it already exists in the uniqueIntegers set. If a unique integer is found, it is added to the set and assigned to the corresponding index in the result array.

After generating N-1 unique integers, the function calculates the last integer needed to make the sum of all integers in uniqueIntegers equal to 0. It subtracts the sum of the uniqueIntegers from 0 and assigns the negative sum to the last index in the result array.

Finally, the function returns the result array.

In the main method, an example usage is shown where N is set to 4. The generated zero-sum array is then printed to the console.

Please note that since the function generates random integers, there can be multiple correct answers for each value of N.
     */
}
