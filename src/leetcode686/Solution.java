package leetcode686;

/**
 * @author lbsswhu
 * @create 2018 03 04 21:10
 * @Description
 **/
public class Solution {
    public int repeatedStringMatch(String A, String B) {
        int l1 = B.length()/A.length();
        int l2 = B.length()%A.length();
        StringBuilder x = new StringBuilder(A);
        if(l1==0)
            return -1;
        if(A.equals(B)||A.indexOf(B)>=0)
            return 1;
        for(int i=2;i<l1+3;i++){
            x = x.append(A);
            if(x.length()>B.length() && x.toString().indexOf(B)>=0)
                return i;
        }
        return -1;
    }
}
