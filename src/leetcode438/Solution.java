package leetcode438;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lbsswhu
 * @create 2018 02 28 10:14
 * @Description
 **/

public class Solution {
    public List<Integer> findAnagrams(String s,String p){
        List<Integer> result = new ArrayList<>();
        char[] s1 = s.toCharArray();
        for(int i = 0;i<=s.length()-p.length();i++){
            int sum = 0;
            int tep = 0;
            char[] p1 = p.toCharArray();
            for(int j=0;j<p.length();j++){
                sum = sum+s1[i+j]-p1[j];
                tep = j;
                if(s1[i+j]!=p1[j])
                    if(p.indexOf(s1[j+j])<0)
                        break;
            }
            if(sum == 0 && tep!=p.length()-1)
                result.add(i);
        }
        return result;

    }
}

//class Solution {
//    public List<Integer> findAnagrams(String s, String p) {
//        List<Integer> result = new ArrayList<>();
//        int[] chars= new int[26];
//        if(s == null || p== null ||s.length()<p.length())
//            return result;
//        for(char c:p.toCharArray())
//            chars[c-'a']++;
//        int begin = 0,end = 0,count=p.length();
//        while(end<s.length()){
//              if(chars[s.charAt(end++)-'a']-->0)
//            if(chars[s.charAt(end)-'a']>0){
//                chars[s.charAt(end)-'a']--;
//                end++;
//                count--;
//            }else{
//                chars[s.charAt(end)-'a']--;
//                end++;
//            }
//            if(count==0)
//                result.add(begin);
//            if(end-begin==p.length() ){
//                if(chars[s.charAt(begin)-'a']>=0){
//                    chars[s.charAt(begin)-'a']++;
//                    begin++;
//                    count++;
//                }else{
//                    chars[s.charAt(begin)-'a']++;
//                    begin++;
//                }
//            }
//        }
//        return result;
//    }
//}
