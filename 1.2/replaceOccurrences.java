import java.util.Arrays;

class replaceOccurrences {
    public static void main(String args[]) {
        // [input] array.integer inputArray
        Integer[] inputArray = { 1, 2, 3 };
        // [input] integer elemToReplace
        Integer elemToReplace = 1;
        // [input] integer substitutionElem
        Integer substitutionElem = 3;
        if (inputArray.length > 10000) {// Guaranteed constraints: 0 ≤ inputArray.length ≤ 10^4
            System.out.println("The array must have from 0 to 10000 elements");
        } else if (0 > elemToReplace || elemToReplace > 1000000000) {// Guaranteed constraints: 0 ≤ elemToReplace ≤ 10^9
            System.out.println("The element to replace must be from 0 to 1000000000");
        } else if (0 > substitutionElem || substitutionElem > 1000000000) {// Guaranteed constraints: 0 ≤ elemToReplace
                                                                           // ≤ 10^9
            System.out.println("The element for substitution must be from 0 to 1000000000");
        } else {
            // Guaranteed constraints: 0 ≤ inputArray[i] ≤ 10^9
            int i;
            for (i = 0; i < inputArray.length; i++) {
                if (0 > inputArray[i] || inputArray[i] > 1000000000) {
                    System.out.println("All the elements in the array must be from 0 to 1000000000");
                    break;
                }
            }
            if (i == inputArray.length)
                System.out.println(Arrays.toString(arrayReplace(inputArray, elemToReplace, substitutionElem)));
        }
    }

    public static Integer[] arrayReplace(Integer[] inputArray, int elemToReplace,
            int substitutionElem) {
        Integer[] outputArray = inputArray;
        for (int j = 0; j < inputArray.length; j++) {
            if (inputArray[j] == elemToReplace)
                outputArray[j] = substitutionElem;
        }
        return outputArray;
    }
}