package leetcode205;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lbsswhu
 * @create 2018 02 27 16:47
 * @Description
 **/
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())
            return false;
        Map<Character,Character> map1 = new HashMap<>();
        Map<Character,Character> map2 = new HashMap<>();
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        for(int i = 0;i<s.length();i++){
            if(map1.containsKey(s1[i]) && map2.containsKey(t1[i])){
                if(map1.get(s1[i])==t1[i] && map2.get(t1[i])==s1[i])
                    continue;
                else
                    return false;
            }else if(!map1.containsKey(s1[i]) && !map2.containsKey(t1[i])){
                map1.put(s1[i],t1[i]);
                map2.put(t1[i],s1[i]);
            }else
                return false;

        }
        return true;
    }
}
