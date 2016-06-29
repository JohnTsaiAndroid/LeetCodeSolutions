package xyz.johntsai.leetcode._26;

/**
 * Created by JohnTsai on 16/6/29.
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        int result = length;
        if(length==0)
            return 0;
        for(int i = 0,j;i<length;i++){
            int diff = 0;
            for( j = i+1;j<length;j++){
                if(nums[i]!=nums[j]){
                    diff = j;
                    break;
                }
            }
            if(diff!=0&&diff!=i+1){
                int changeLength = diff-i-1;
                for(int k = i+1;k<length-changeLength;k++){
                    nums[k] = nums[k+changeLength];
                }
                length=length-changeLength;
                result = length;
            }
            if(diff==0&&nums[i]==nums[length-1]){
                result=result-(length-1-i+1);
                break;
            }
        }
        return result;
    }
}
