/**

 https://app.codility.com/programmers/lessons/4-counting_elements/perm_check/

 A non-empty array A consisting of N integers is given.

 A permutation is a sequence containing each element from 1 to N once, and only once.

 For example, array A such that:
 A[0] = 4
 A[1] = 1
 A[2] = 3
 A[3] = 2

 is a permutation, but array A such that:
 A[0] = 4
 A[1] = 1
 A[2] = 3

 is not a permutation, because value 2 is missing.

 The goal is to check whether array A is a permutation.

 Write a function:

 class Solution { public int solution(int[] A); }

 that, given an array A, returns 1 if array A is a permutation and 0 if it is not.

 For example, given array A such that:
 A[0] = 4
 A[1] = 1
 A[2] = 3
 A[3] = 2

 the function should return 1.

 Given array A such that:
 A[0] = 4
 A[1] = 1
 A[2] = 3

 the function should return 0.

 Write an efficient algorithm for the following assumptions:

 N is an integer within the range [1..100,000];
 each element of array A is an integer within the range [1..1,000,000,000].
 */

package org.gleison.codility.lesson04;

import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

public class PermCheck {

    public int solution(int[] A) {
        if (A.length != 0) {
            // creating a set to guarantee uniqueness
            Set<Integer> set = new HashSet<Integer>(A.length, 1);
            for (int i : A) {
                if (i < 1) {
                    return 0;
                }
                set.add(i);
            }
            if (set.size() == A.length) { // it's unique
                if (Collections.max(set) == set.size()) { // it doesn't have gaps
                    return 1;
                }
            }
        }
        return 0;
    }

}
