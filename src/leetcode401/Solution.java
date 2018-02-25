package leetcode401;
import javax.sound.midi.Soundbank;
import java.util.LinkedList;
import java.util.List;
/**
 * Created by Lb on 17-4-3.
 * https://leetcode.com/problems/binary-watch/#/description
 */
public class Solution {
    public String watchtime(int hour,int minute){
        if(minute < 10)
            return ""+hour+":"+"0"+minute;
        else
            return ""+hour+":"+minute;
    }
    public static  int numofone(int num){
        int res =0;
        while(num!=0){
            if(num%2==1)
                res++;
                num = num>>1;
        }
        return res;
    }
    public List<String> readBinaryWatch(int num) {
        List<String> res = new LinkedList<>();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                //if((numofone(i)+numofone(j)) == num)
                //bitCount返回补码中1的个数
                if(Integer.bitCount(i * 64 + j) == num)
                    res.add(watchtime(i,j));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int num = 3;
        System.out.println(numofone(num));;
    }
}
