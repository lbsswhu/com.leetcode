package leetcode443;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author lbsswhu
 * @create 2018 02 26 17:01
 * @Description
 **/
public class Solution {
    public int compress(char[] chars){
        int count = 1;
        int locate = 0;
        for(int i = 0;i<chars.length;i++){
            if(chars[i+1]!=chars[i]){
                chars[locate] = chars[i];
                locate++;
                if(count>1)
                for(char c:(""+count).toCharArray()){
                    chars[locate] = c;
                    locate++;
                }
                count = 0;
            }
            count++;

        }
        return locate;
    }

    public static void main(String[] args) {
        Solution f = new Solution();
        f.compress(new char[]{'a','a','b','b','c','c','c'});
    }
}
