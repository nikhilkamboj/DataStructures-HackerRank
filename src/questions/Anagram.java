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
        int[] alphaArray1 = new int[ALPHABET_NUMBER];
        int[] alphaArray2 = new int[ALPHABET_NUMBER];

        for (int i = 0; i < string1.length(); i++) {
            int offset = (int) 'a';
            char charAtPosition = string1.charAt(i);
            int arrayIndexToBeAdded = charAtPosition - offset;

            alphaArray1[arrayIndexToBeAdded]++;
        }

        for (int i = 0; i < string2.length(); i++) {
            int offset = (int) 'a';
            char charAtPosition = string2.charAt(i);
            int arrayIndexToBeAdded = charAtPosition - offset;

            alphaArray2[arrayIndexToBeAdded]++;
        }

        int numberOfAlphaToRemove = 0;

        for (int i = 0; i < ALPHABET_NUMBER; i++) {
            numberOfAlphaToRemove += Math.abs(alphaArray1[i] - alphaArray2[i]);
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
