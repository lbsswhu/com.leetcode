package leetcode290;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lbsswhu
 * @create 2018 03 02 10:31
 * @Description
 **/
public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] strA = str.split(" ");
        if(strA.length != pattern.length())
            return false;
        Map map = new HashMap();
        for(int i =0;i<pattern.length();i++){
            if(map.put(pattern.charAt(i),i) != map.put(strA[i],i))
                return false;
        }
        return true;
    }
}
