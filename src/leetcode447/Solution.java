package leetcode447;

import java.util.HashMap;
import java.util.Map;

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
    public static int getDistance(int[] point1,int[] points2){
        return (int) (Math.pow(point1[0]-points2[0],2)+Math.pow(point1[1]-points2[1],2));
    }
    public static int numberOfBoomerangs(int[][] points) {
        int res = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if(i==j)
                    continue;
                else{
                    int dis = getDistance(points[i],points[j]);
                    map.put(dis,map.getOrDefault(dis,0)+1);
                }
            }
            for (int var:map.values()
                 ) {
                res += var*(var-1);
            }
            map.clear();
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] test={{1,0},{0,0},{2,0}};
        System.out.println(numberOfBoomerangs(test));
    }
}
