package leetcode67;

import java.util.List;

/**
 * @author lbsswhu
 * @create 2018 03 01 16:01
 * @Description
 **/
public class Solution {
    public String addBinary(String a, String b) {
        String res = "";
        int length = 0;
        if(a.length()>b.length()){
            length = a.length();
            while(b.length()<a.length())
                b= "0"+b;
        }
        else{
            length = b.length();
            while(a.length()<b.length())
                a= "0"+b;
        }
        char[] s1 = a.toCharArray();
        char[] t1 = b.toCharArray();
        int count = 0;
        for(int i=a.length()-1;i>=0;i--){
            if(Character.getNumericValue(s1[i])+count+Character.getNumericValue(t1[i])>1){
                count = 1;
                res = "0"+res;
            }else {
                count = 0;
                res = ""+(Character.getNumericValue(s1[i])+count+Character.getNumericValue(t1[i]))+res;
            }
        }
        if(count==0)
            return res;
        else
            return "1"+res;
    }

    public static void main(String[] args) {
        Solution t= new Solution();
        System.out.println(t.addBinary("0","0"));
    }
}
