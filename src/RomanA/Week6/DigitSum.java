package RomanA.Week6;

public class DigitSum {

    //3. Sum of digits in a string:
    //  Write a method that can return the sum of the digits in a string.
    //
    //  Ex: "A3v15" = > 3 + 1 + 5 = 9
    //        return 9

    public static int SumDigit(String str) {

        int sum = 0;

        for (char each : str.replaceAll("\\D", "").toCharArray()){
            int digit = each - '0';

            sum += digit;
        }
        return sum;
    }

    public static void main(String[] args) {

        String str = "A3v151sdf756s7dfsd9fsdfsdf5sdf";

        System.out.println(SumDigit(str));

    }
}
