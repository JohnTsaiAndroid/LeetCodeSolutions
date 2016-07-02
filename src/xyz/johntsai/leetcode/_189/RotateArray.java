package xyz.johntsai.leetcode._189;

/**
 * Created by JohnTsai on 16/7/2.
 */
public class RotateArray {
    /**
     *
     *
     *       1,2,3
     * index:0,1,2
     *  rotate: 1
     *
     *        3,1,2
     *  index:0,1,2
     *
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        if(nums==null||nums.length==1)return;
        int length = nums.length;
        int [] result = new int [length];
        for(int i = 0;i<length;i++){
            result[(i+k)%length]=nums[i];
        }
        for(int i =0;i<length;i++){
            nums[i]=result[i];
        }
    }
}
