/**

 Two frogs got into a fight and want to get as far away from eachother as they can.
 Given a list representing height of each stone (ex. [3, 5, 8, 2, 1, 6]) return maximum distance from eachother they can reach if they can jump only to stone thats higher than one they're currently at.
 Also frogs start from the same point and that can be anywhere in the array.

 Array of integers named "blocks" with the size N is given and every integer is the size of the block; you have 2 frogs that start on one block (either the first one or the "optimal starting block") and the frogs want to get as far away from eachother as possible.
 The frogs can only jump to the adjacent block if it is at least as big as the one they are sitting on and can not jump if the adjacent block is smaller than the one they sit on.
 The exercise also states that distance between blocks numbered J and K, where J<=K is computed as K - J + 1.
 The question is: what is the longest distance that thez can possibly create between each other if thezy chose the optimal starting block.

 example 1:
 Given blocks [2,6,8,5] it should return 3 (starting block is 0 and right frog jumps to blocks[2])

 example 2:
 Given blocks [1,5,5,2,6] it should return 4 (starting block is [3], left frog jumps to [1] and right frog to [4])

 */

package org.gleison.microsoft;

public class FrogFight {

    public int solution(int[] A) {
        int N = A.length;
        int res = -1;

        for (int i = 0; i < N; i++) {

            // frog going left, will land on J
            int J = i;
            for (int left = i-1; left >= 0; left--){
                if (A[left] >= A[left+1]) {
                    J = left;
                } else {
                    break;
                }
            }

            // frog going right, will land on K
            int K = i;
            for (int right = i+1; right < N; right++) {
                if (A[right] >= A[right-1]) {
                    K = right;
                } else {
                    break;
                }
            }

            // if the distance is bigger
            int t = K - J + 1;
            if (t > res) {
                res = t;
            }
        }

        return res;
    }

}
