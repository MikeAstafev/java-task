package cz.acamar.tasks;

public class Task2 {

    /**
     * Task 2. Squares of a sorted array.
     * <p>
     * Given an integer array sorted in non-decreasing order,
     * return an array of the squares of each number sorted in non-decreasing order.
     * <p>
     * Example input: [-4,-1,0,3,10]
     * Expected output: [0,1,9,16,100]
     * <p>
     * Explanation: After squaring, the array becomes [16,1,0,9,100].
     * After sorting, it becomes [0,1,9,16,100].
     *
     * @param input - an integer array sorted in non-decreasing order
     * @return - an array of the squares of each number sorted in non-decreasing order
     */
    public int[] squaresOfSortedArray(int[] input) {

        // As the array is already sorted we can compare the first and the last elements.
        // After that we simply squares the biggest one and place it at the end of result array
        // So time complexity and auxiliary space will be O(n)
        int left = 0, right = input.length - 1;

        int[] result = new int[input.length];

        for(int i = input.length - 1; i >=0; --i) {
            if(Math.abs(input[left]) > Math.abs(input[right])) {
                result[i] = input[left]*input[left];
                ++left;
            } else {
                result[i] = input[right]*input[right];
                --right;
            }
        }
        return result;
    }
}
