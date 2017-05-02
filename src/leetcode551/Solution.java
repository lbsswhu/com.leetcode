package leetcode551;

/**
 * Created by Lb on 17-5-2.
 */
public class Solution {
    public static boolean checkRecord(String s) {
        int[] a =new int[3];
        for (char sm:s.toCharArray()
             ) {
            switch (sm){
                case 'P': a[0]++;a[2]=0;break;
                case 'A': a[1]++;a[2]=0;break;
                case 'L': a[2]++;break;
                default:break;
            }
            if(a[1]>1||a[2]>2){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkRecord("LALL"));
    }
}