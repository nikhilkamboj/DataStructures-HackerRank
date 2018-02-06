package questions;

/**
 * strings are anagram if the have same number of alphabets in any permutation combination.
 *
 * hello and billion can be anagrams if we remove he from hello and biion from billion.
 *
 *
 */


public class Anagram {

    private static final int ALPHABET_NUMBER = 26;

//    send strings in strict lower or upper case only, otherwise error may arise because of different ascii values od characters.
    public int removeToMakeAnagram(String string1, String string2) {

        int[] alphaIndexArray1 = makeAlphabetIndexedArray(string1);
        int[] alphaIndexArray2 = makeAlphabetIndexedArray(string2);

        return checkArrayDifference(alphaIndexArray1,alphaIndexArray2);
    }


    private int[] makeAlphabetIndexedArray(String string) {
        int[] alphaArray = new int[ALPHABET_NUMBER];

        for (int i = 0; i < string.length(); i++) {
            int offset = (int) 'a';
            char charAtPosition = string.charAt(i);
            int arrayIndexToBeAdded = charAtPosition - offset;

            alphaArray[arrayIndexToBeAdded]++;
        }
        return alphaArray;
    }

    private int checkArrayDifference (int[] alphaIndexArray1, int[] alphaIndexArray2) {
        int numberOfAlphaToRemove = 0;
        for (int i = 0; i < ALPHABET_NUMBER; i++) {
            numberOfAlphaToRemove += Math.abs(alphaIndexArray1[i] - alphaIndexArray2[i]);
        }
        return numberOfAlphaToRemove;
    }

    public static void main(String[] args) {
        String string1 = "nikhil";
        String string2 = "nikhil";

        Anagram anagram = new Anagram();
        System.out.println(anagram.removeToMakeAnagram(string1,string2));
    }

}
