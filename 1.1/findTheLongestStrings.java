import java.util.Arrays;

class findTheLongestStrings {
    public static void main(String args[]) {
        // {input] array.string inputArray
        String[] inputArray = { "aba", "aa", "ad", "vcd", "aba" };
        if (1 > inputArray.length || inputArray.length > 10) {// Guaranteed constraints: 1 ≤ inputArray.length ≤ 10
            System.out.println("The array must have from 1 to 10 strings");
        } else {
            // Guaranteed constraints: 1 ≤ inputArray[i].length ≤ 10
            int i;
            for (i = 0; i < inputArray.length; i++) {
                if (inputArray[i].isEmpty() || inputArray[i].length() > 10) {
                    System.out.println("All the strings in the array must have from 1 to 10 characters");
                    break;
                }
            }
            if (i == inputArray.length)
                System.out.println(Arrays.toString(allLongestStrings(inputArray)));
        }
    }

    public static String[] allLongestStrings(String[] inputArray) {
        int longestSize = 1;
        int numLongestStrings = 1;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].length() > longestSize) {
                longestSize = inputArray[i].length();
                numLongestStrings = 1;
            } else if (inputArray[i].length() == longestSize) {
                numLongestStrings++;
            }
        }
        String[] outputArray = new String[numLongestStrings];
        int i = 0;
        for (int j = 0; j < inputArray.length; j++) {
            if (inputArray[j].length() == longestSize) {
                outputArray[i] = inputArray[j];
                i++;
            }
        }
        return outputArray;
    }
}