/**

 https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/

An array A consisting of N different integers is given.
The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

Your goal is to find that missing element.

Write a function:
    class Solution { public int solution(int[] A); }

that, given an array A, returns the value of the missing element.

For example, given array A such that:
  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5

the function should return 4, as it is the missing element.

Write an efficient algorithm for the following assumptions:

        N is an integer within the range [0..100,000];
        the elements of A are all distinct;
        each element of array A is an integer within the range [1..(N + 1)].
 */

package org.gleison.codility.lesson03;

import java.util.Arrays;

public class PermMissingElem {

    public int solution(int[] A) {
        if (A.length == 0) {
            return 1;
        }

        Arrays.sort(A);

        if (A[0] != 1) {
            return 1;
        }

        for (int i = 0; i < A.length-1; i++) {
            int currN = A[i];
            int nextN = A[i+1];

            if (currN + 1 != nextN) {
                return currN + 1;
            }
        }

        // if it gets here, then no number is missing
        // so the next logical number is returned
        return A.length + 1;
    }

}
