/**
 * Braille Translation
 * ===================
 * Because Commander Lambda is an equal-opportunity despot, they have several visually-impaired minions. But Lambda never bothered to follow intergalactic standards for workplace accommodations, so those minions have a hard time navigating her space station. You figure printing out Braille signs will help them, and -- since you'll be promoting efficiency at the same time -- increase your chances of a promotion.
 * <p>
 * Braille is a writing system used to read by touch instead of by sight. Each character is composed of 6 dots in a 2x3 grid, where each dot can either be a bump or be flat (no bump). You plan to translate the signs around the space station to Braille so that the minions under Commander Lambda's command can feel the bumps on the signs and "read" the text with their touch. The special printer which can print the bumps onto the signs expects the dots in the following order:
 * 1 4
 * 2 5
 * 3 6
 * <p>
 * So given the plain text word "code", you get the Braille dots:
 * <p>
 * 11 10 11 10
 * 00 01 01 01
 * 00 10 00 00
 * <p>
 * where 1 represents a bump and 0 represents no bump. Put together, "code" becomes the output string "100100101010100110100010".
 * <p>
 * Write a function solution(plaintext) that takes a string parameter and returns a string of 1's and 0's representing the bumps and absence of bumps in the input string. Your function should be able to encode the 26 lowercase letters, handle capital letters by adding a Braille capitalization mark before that character, and use a blank character (000000) for spaces. All signs on the space station are less than fifty characters long and use only letters and spaces.
 * <p>
 * Test cases
 * ==========
 * Your code should pass the following test cases.
 * <p>
 * -- Java cases --
 * Input:
 * Solution.solution("Braille")
 * Output:
 * 	000001110000111010100000010100111000111000100010
 * <p>
 * Input:
 * Solution.solution("The quick brown fox jumps over the lazy dog")
 * Output:
 * 	000001011110110010100010000000111110101001010100100100101000000000110000111010101010010111101110000000110100101010101101000000010110101001101100111100011100000000101010111001100010111010000000011110110010100010000000111000100000101011101111000000100110101010110110
 * <p>
 * Input:
 * Solution.solution("code")
 * Output:
 * 	100100101010100110100010
 */

package org.gleison.google.foobar;

import java.util.Map;
import java.util.HashMap;

public class BrailleTranslation {

    private static Map<Character, String> dict = null;

    public static String solution(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            res = res + getDictionary().get(c);
        }
        return res;
    }

    private static Map<Character, String> getDictionary() {
        if (dict == null) {
            dict = new HashMap<Character, String>();

            Character[] cap = new Character[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
            String sCode = "000001011110110010100010000000111110101001010100100100101000000000110000111010101010010111101110000000110100101010101101000000010110101001101100111100011100000000101010111001100010111010000000011110110010100010000000111000100000101011101111000000100110101010110110";
            String sText = "The quick brown fox jumps over the lazy dog";

            // getting the normal letters
            int index = 0;
            for (int i = 0; i < sText.length(); i++) {
                char c = sText.charAt(i);
                int indexEnd = index + (Character.isUpperCase(c) ? 12 : 6);
                dict.put(c, sCode.substring(index, indexEnd));
                index += Character.isUpperCase(c) ? 12 : 6;
            }

            // getting capital letters
            for (char c : cap) {
                if (dict.get(c) == null) {
                    String l = dict.get(Character.toLowerCase(c));
                    dict.put(c, "000001" + l);
                }
            }
        }

        return dict;
    }

}
