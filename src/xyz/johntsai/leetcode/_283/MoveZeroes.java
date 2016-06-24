package xyz.johntsai.leetcode._283;

import java.util.Arrays;

/**
 * Created by JohnTsai on 16/6/24.
 */
public class MoveZeroes {
    /**
     * before:0 0 1
     *
     *        1 0 0
     *
     * after: 1 0 0
     *
     * before:1 0 3 0 5
     *
     *        1 3 0 0 5
     *
     *        1 3 5 0 0
     *
     * after: 1 3 5 0 0
     *
     *
     *
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        int zero;
        for(int i =0;i<length;i++){
            if(nums[i]==0){
                zero = i;
                for(int j =zero;j<length;j++){
                    if(nums[j]!=0){
                        int temp = nums[zero];
                        nums[zero] = nums[j];
                        nums[j] = temp;
                        zero = j;
                    }
                }
            }
        }
    }

    /**
     * http://blog.csdn.net/nomasp/article/details/50409676
     * @param nums
     */
    public void moveZeroesBetterSolutions(int[] nums){
        for(int index=0,curr=0;curr<nums.length;curr++){
            if(nums[curr]!=0){
                int temp = nums[index];
                nums[index] = nums[curr];
                nums[curr] = temp;
                index++;
            }
        }
    }

    public static void main(String[] args) {
        int [] nums =  {1,2,0,5,0,1};
        MoveZeroes moveZeroes = new MoveZeroes();
//        moveZeroes.moveZeroes(nums);
//        System.out.println(Arrays.toString(nums));
        moveZeroes.moveZeroesBetterSolutions(nums);
        System.out.println(Arrays.toString(nums));
    }
}
