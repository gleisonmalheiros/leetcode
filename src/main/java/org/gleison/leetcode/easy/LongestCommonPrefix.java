package org.gleison.leetcode.easy;

/**
 * #14
 * https://leetcode.com/problems/longest-common-prefix/description/

 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 */

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        String res = "";

        if (strs.length > 0) {
            res = strs[0]; // first prefix is whole first word

            for (int i = 1; i < strs.length; i++) { // for each word after the first
                String word = strs[i];

                if (word.length() < res.length()) { // whichever smaller
                    res = res.substring(0,word.length());
                }

                for (int j = 0; j < res.length(); j++) {
                    if (res.charAt(j) != word.charAt(j)) {
                        if (j == 0) {
                            return "";
                        } else {
                            res = res.substring(0,j);
                            break;
                        }
                    }
                }
            }
        }

        return res;
    }

}
