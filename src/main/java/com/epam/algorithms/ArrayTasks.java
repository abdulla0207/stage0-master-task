package com.epam.algorithms;


import java.util.ArrayList;
import java.util.List;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        String[] seasons = new String[4];
        seasons[0] = "Winter";
        seasons[1] = "Spring";
        seasons[2] = "Summer";
        seasons[3] = "Fall";
        return seasons;
    }

    /**
     * Generate an int[] array of consecutive positive integers starting at 1 of the given length (length parameter >
     * 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1] length = 3  -> [1, 2, 3] length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[] res = new int[length];
        int numToAdd = 1;
        for (int i = 0; i < length; i++) {
            res[i] = numToAdd;
            numToAdd++;
        }
        return res;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9 arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int res = 0;
        for (int i : arr) {
            res +=i;
        }
        return res;
    }


    /**
     * Return the index of the first occurrence of number in the arr array. If there is no such element in the array,
     * return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2 arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number)
                return i+1;
        }
        return -1;
    }

    /**
     * Return the new String[] array obtained from the arr array by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"] arr = ["pineapple", "apple", "pen"] -> ["pen", "apple",
     * "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String[] res = new String[arr.length];
        int resIndex = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            res[resIndex] = arr[i];
        }
        return res;
    }

    /**
     * Return new int[] array obtained from arr int[] array by choosing positive numbers only. P.S. 0 is not a positive
     * number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3] arr = [-1, -2, -3]   -> [] arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int[] fillPosNums = new int[arr.length];
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                fillPosNums[counter++] = arr[i];
        }
        List<Integer> withoutZero = new ArrayList<>();
        for (int fillPosNum : fillPosNums) {
            if(fillPosNum != 0)
                withoutZero.add(fillPosNum);
        }
        int[] res = new int[withoutZero.size()];

        for (int i = 0; i < withoutZero.size(); i++) {
            res[i] = withoutZero.get(i);
        }
        return res;
    }


    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules: Incoming one-dimensional arrays
     * must be arranged in ascending order of their length; numbers in all one-dimensional arrays must be in ascending
     * order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]] arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
//        Arrays.sort(arr, Comparator.comparingInt(a -> a.length));
//        for (int[] ints : arr) {
//            Arrays.sort(ints);
//        }
//        return arr;
        return null;
    }

}
