package xyz.johntsai.leetcode._27;

/**
 * Created by JohnTsai on 16/6/24.
 */
public class RemoveElement {
    /**
     * 3,2,2,3 remove 3
     * 2 3 2 3
     * 2 2 3 3 length 2
     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int i = 0;
        for(int j = 0;j<length;j++){
            if(nums[j]!=val){
                nums[i++] = nums[j];
            }
        }
        return i;
    }
}
