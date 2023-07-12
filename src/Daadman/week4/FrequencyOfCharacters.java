package Daadman.week4;

public class FrequencyOfCharacters {

    //Write a return method that can find the frequency of characters
    //  Ex: frequencyOfChars("AAABBCDD") ==> A3B2C1D2

    public static String frequencyOfChar(String str) {

       String nonDuplicate = "";
        for (int i = 0; i < str.length(); i++) {
            if (!nonDuplicate.contains("" + str.charAt(i))) {
                nonDuplicate = nonDuplicate + str.charAt(i);
            }
        }
            String expectedResult = "";
            for (int j = 0; j < nonDuplicate.length(); j++) {

                int count = 0;
                for (int i = 0; i < str.length(); i++) {
                    if(nonDuplicate.charAt(j) == str.charAt(i)) {
                        count++;
                }
            }
                expectedResult += "" + nonDuplicate.charAt(j) + count;

        }

            return expectedResult;
    }

    public static void main(String[] args) {

        System.out.println(frequencyOfChar("AABBCDDDEFFFFGGGGGG"));
    }
}

/*
The given block of code aims to find the frequency of each unique character in a string str and return the result as a formatted string.

Let's break down the code:


String nonDuplicate = "";
for (int i = 0; i < str.length(); i++) {
    if (!nonDuplicate.contains("" + str.charAt(i))) {
        nonDuplicate = nonDuplicate + str.charAt(i);
    }
}
String nonDuplicate = "";: This creates an empty string nonDuplicate to store the unique characters from the original string str.
for (int i = 0; i < str.length(); i++): This is a for loop that iterates over the characters of the string str. It initializes an index variable i to 0, and the loop continues as long as i is less than the length of str. After each iteration, i is incremented by 1.
if (!nonDuplicate.contains("" + str.charAt(i))): This if statement checks if the character at the current index (i) in str is not already present in the nonDuplicate string. The contains method is used to check for the presence of a character in a string. str.charAt(i) retrieves the character at index i in str, and "" + str.charAt(i) converts it to a string for comparison.
nonDuplicate = nonDuplicate + str.charAt(i);: If the character is not already present in nonDuplicate, it is appended to the nonDuplicate string using the concatenation operator (+). This ensures that nonDuplicate contains only the unique characters from str.


String expectedResult = "";
for (int j = 0; j < nonDuplicate.length(); j++) {
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
        if (nonDuplicate.charAt(j) == str.charAt(i)) {
            count++;
        }
    }
    expectedResult += " " + nonDuplicate.charAt(j) + "" + count;
}
return expectedResult;
String expectedResult = "";: This creates an empty string expectedResult to store the final result.
for (int j = 0; j < nonDuplicate.length(); j++): This for loop iterates over the characters in the nonDuplicate string. It initializes an index variable j to 0, and the loop continues as long as j is less than the length of nonDuplicate. After each iteration, j is incremented by 1.
int count = 0;: This initializes a counter variable count to 0 to keep track of the frequency of the current character.
for (int i = 0; i < str.length(); i++): This nested for loop iterates over the characters in the original string str. It initializes an index variable i to 0, and the loop continues as long as i is less than the length of str. After each iteration, i is incremented by 1.
if (nonDuplicate.charAt(j) == str.charAt(i)): This if statement checks if the character at the current index (j) in nonDuplicate is equal to the character at the current index (i) in str.
count++;: If the characters match, the count variable is incremented by 1.
expectedResult += " " + nonDuplicate.charAt(j) + "" + count;: This concatenates the current character from nonDuplicate, the frequency count, and a space to the expectedResult string.
return expectedResult;: Finally, the method returns the expectedResult string, which contains the frequencies of each unique character in the original string str.
The returned expectedResult string will be formatted with each unique character followed by its frequency, separated by a space.
 */
