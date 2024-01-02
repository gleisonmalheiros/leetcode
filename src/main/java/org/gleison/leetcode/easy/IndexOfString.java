package org.gleison.leetcode.easy;

/**
 * #28
 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
 * <p>
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */

public class IndexOfString {

    public int strStr(String haystack, String needle) {

        // just the line below would be enough, but what's the point then...
        // return haystack.indexOf(needle);

        int res = -1;

        if (needle.length() <= haystack.length()) {
            for (int i = 0; i <= (haystack.length() - needle.length()); i++) {
                var word = haystack.substring(i, needle.length()+i);
                if (needle.equals(word)) {
                    return i;
                }
            }
        }

        return res;
    }

}
