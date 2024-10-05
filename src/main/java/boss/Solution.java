package boss;

import java.util.*;

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * 无
     * @param nums int整型一维数组
     * @param target int整型
     * @return int整型一维数组
     */
    public int[] twosum (int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    int[] out = {i,j};
                    return out;
                }
            }
        }
        // write code here
        return null;
    }

    public static void main(String[] args) {
        int [] a = {2,4,5};
        int[] twosum = new Solution().twosum(a, 7);

    }
}