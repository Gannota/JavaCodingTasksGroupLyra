package RomanA.Week2_Coding;

public class ConsecutiveNumbers {

    public static void main(String[] args) {

        for (int i = 1; i <= 24; i++) {
            String result = (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) ? "CodilityTestCoders" : (i % 2 == 0 && i % 3 == 0) ? "CodilityTest" : (i % 2 == 0 && i % 5 == 0) ? "CodilityCoders" : (i % 3 == 0 && i % 5 == 0) ? "TestCoders" : (i % 2 == 0) ? "Codility" : (i % 3 == 0) ? "Test" : (i % 5 == 0) ? "Coders" : i + "";

            System.out.println(result);

        }

    }
}
