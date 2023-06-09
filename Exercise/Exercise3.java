package Exercise;

import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args) {
        exercise3();
    }

    // TODO
    private static void exercise3() {
        /*
        Task: write code to check whether a given array contains a valid fibonacci sequence
        Input: an array of arrays
        Output: true or false for each array
        Logic: return TRUE if a given array contains a valid fibonacci sequence, and FALSE otherwise
        Validation: validate with array of length of at least 10
         */
        int[][] arrays = {
                {},
                {0, 1, 1, 2, 3},
                {0, 1, 1, 2, 3, 5, 8, 13, 21, 34},
                {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610},
                {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 611},
                {1},
                {0, 2, 1, 2, 3},
                {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 611},
                // TODO: add a few more...

        };

        for (int[] array : arrays) {
            System.out.println(Arrays.toString(array) + ": " + isValidFib(array));
        }
    }

    private static boolean isValidFib(int[] array) {
        //TODO: add your code
        int[] fibonacciSequence = {0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181};
        if (array.length == 0) {
            return false;
        }
        for(int i = 0; i < array.length; i++){
            if (array[i] != fibonacciSequence[i] || array.length == 0){
                return false;
            }
        }
        return true;
    }
}