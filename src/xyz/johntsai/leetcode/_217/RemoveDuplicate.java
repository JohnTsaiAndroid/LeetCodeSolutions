package xyz.johntsai.leetcode._217;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by JohnTsai on 16/6/30.
 * https://leetcode.com/problems/contains-duplicate/
 */
public class RemoveDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if(nums==null||nums.length==0)
            return false;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num))
               return true;
        }
        return false;
    }
}

