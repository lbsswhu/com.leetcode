package leetcode605;

/**
 * @author lbsswhu
 * @create 2018 03 15 10:03
 * @Description
 **/
public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0,j=0;
        if(flowerbed[0]==0 && flowerbed.length ==1)
            return 1>=n;
        for(int i = 0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                j++;
                if(i == flowerbed.length-1 || i==0)
                    j++;
            }
            else {
                count += (j-1)/2;
                j=0;
            }
            if(i == flowerbed.length-1)
                count += (j-1)/2;
        }
        return count>=n;
    }
}
