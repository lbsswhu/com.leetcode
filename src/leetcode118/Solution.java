package leetcode118;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        int[][] a = new int[numRows][numRows];
        for(int i=0;i<numRows;i++){
            if(i==0)
                a[i][0]=1;
            if(i==1){
                a[i][0] = 1;a[i][i]=1;
            }
            if(i>1){
                a[i][0] =1;a[i][i]=1;
                for(int j=1;j<i;j++){
                    a[i][j] = a[i-1][j-1]+a[i-1][j];
                }
            }
        }
        for(int i=0;i<numRows;i++){
            List<Integer> temp = new ArrayList<>();
            for(int j =0;j<i+1;j++){
                temp.add(a[i][j]);
            }
            res.add(temp);
        }
        return res;
    }
}
