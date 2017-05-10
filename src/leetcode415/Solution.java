package leetcode415;

/**
 * Created by Lb on 17-5-2.
 */
public class Solution {
    public static String addStrings(String num1, String num2) {
        String res = "";
        int carry = 0;
        int length1 = num1.length();
        int length2 = num2.length();
        if(length1>length2){
            int differ = length1 - length2;
            while(differ>0){
                num2 = "0"+num2;
                differ--;
            }
        }
        else {
            int differ = length2 - length1;
            while(differ>0){
                num1 = "0"+num1;
                differ--;
            }
        }
        int i = num1.length();
        int temp = 0;
        while(i>0){
            int num11 = num1.charAt(i-1)-48;
            int mum22 = num2.charAt(i-1)-48;
            temp=num11+mum22+carry;
            if(temp>9){
                carry = 1;
                res = (temp-10) + res;
            }
            else{
                carry = 0;
                res = temp + res;
            }
            i--;
        }
        if(carry==1){
            res = carry + res;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(addStrings("1","9"));
    }
}
