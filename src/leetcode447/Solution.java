package leetcode447;

/**
 * Created by Lb on 17-4-7.
 * https://leetcode.com/problems/number-of-boomerangs/#/description
 * Given n points in the plane that are all pairwise distinct, a "boomerang" is a tuple of points (i, j, k) such that
 * the distance between i and j equals the distance between i and k (the order of the tuple matters).
 Find the number of boomerangs. You may assume that n will be at most 500 and coordinates of points are all in the
 range [-10000, 10000] (inclusive).
 Example:
 Input:
 [[0,0],[1,0],[2,0]]
 Output:
 2
 Explanati
 The two boomeraon:ngs are [[1,0],[0,0],[2,0]] and [[1,0],[2,0],[0,0]]
 */
public class Solution {
    public static boolean sameDistance(int[] point1,int[] points2,int[] points3){
        return (Math.pow((point1[0]-points2[0]),2)+Math.pow((point1[1]-points2[1]),2))==
                (Math.pow((point1[0]-points3[0]),2)+Math.pow((point1[1]-points3[1]),2));
    }
    public int numberOfBoomerangs(int[][] points) {
        int res = 0;
        return 0;
    }

    public static void main(String[] args) {
        int[][] test={{1,0},{0,0},{3,0}};
        if(sameDistance(test[0],test[1],test[2]))
            System.out.println("1");
        else
            System.out.println("0");
    }
}
