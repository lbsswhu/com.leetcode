package leetcode35;
/**
 * Created by Lb on 17-5-16.
 */
public class Solution {
    private static int binaryQuery(int[] nums,int low,int high,int target){
        int mid = (low+high)/2,res = 0;
        if(target>nums[mid]){
            if(low == high)
                res = mid+1;
            else{
                return binaryQuery(nums,mid+1,high,target);
            }
        }
        if(target<nums[mid]){
            if(low == high)
                if(mid == 0)
                    res = 0;
                else
                    res = mid;
            else
                return binaryQuery(nums,low,mid,target);
        }
        if(target == nums[mid])
            res = mid;
        return res;
    }
    public static int searchInsert(int[] nums, int target) {
        return binaryQuery(nums,0,nums.length-1,target);
    }

    public static void main(String[] args) {
        int[] te = {1,3,5,6};
        System.out.println(searchInsert(te,7));
    }
}

//    public int searchInsert(int[] A, int target) {
//        int low = 0, high = A.length-1;
//        while(low<=high){
//            int mid = (low+high)/2;
//            if(A[mid] == target) return mid;
//            else if(A[mid] > target) high = mid-1;
//            else low = mid+1;
//        }
//        return low;
//    }
