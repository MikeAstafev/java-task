package cz.acamar.tasks;

public class Task1 {

    /**
     * Task 1. Length of the last word.
     * <p>
     * Given a string s consisting of some words separated by some number of spaces,
     * return the length of the last word in the string.
     * <p>
     * A word is a maximal substring consisting of non-space characters only.
     * <p>
     * Example input: "Hello World"
     * Expected output: 5
     *
     * @param str - a string s consisting of some words separated by some number of spaces.
     * @return - the length of the last word in the string.
     */
    public int lengthOfLastWord(String str) {

        //Its cheap to store 2 int params, and complexity of str.charAt(index) is O(n)
        int count = 0;
        for(int i = str.length()-1; i>=0; --i) {
            if(Character.isLetter(str.charAt(i)))
                count++;
            else
                break;
        }
        return count;
    }
}
