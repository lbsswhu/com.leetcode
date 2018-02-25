package leetcode119;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author lbsswhu
 * @create 2018 02 25 12:51
 * @Description
 **/
public class Solution {
    public List<Integer> getRow(int rowIndex){
        List<Integer> result = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        temp.add(1);
        if(rowIndex== 0)
            result.add(1);
        if(rowIndex == 1){
            result.add(1);
            result.add(1);
        }
        if(rowIndex<2)
            return result;
        for(int i=2;i<=rowIndex;i++){
            result.clear();
            result.add(1);
            for(int j=0;j<i-1;j++){
                result.add(temp.get(j)+temp.get(j+1));
            }
            result.add(1);
            temp.clear();
            for(int k=0;k<result.size();k++)
                temp.add(result.get(k));
        }
        return  result;
    }

    public static void main(String[] args) {
        Solution rt = new Solution();
        Iterator<Integer> f = rt.getRow(5).iterator();
        System.out.printf("dfs");
        while (f.hasNext()){

            System.out.println(f.next());
        }
    }
}

/*

public List<Integer> getRow(int rowIndex) {
    List<Integer> res = new ArrayList<Integer>();
    for(int i = 0;i<rowIndex+1;i++) {
    		res.add(1);
    		for(int j=i-1;j>0;j--) {
    			res.set(j, res.get(j-1)+res.get(j));
    		}
    }
    return res;
}
 */
