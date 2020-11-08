https://leetcode-cn.com/problems/two-sum/
1.����֮��

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> sumMap = new HashMap<Integer,Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (sumMap.containsKey(target - nums[i])) {
                return new int[]{sumMap.get(target - nums[i]),i};
            }
            sumMap.put(nums[i],i);
        }
        return new int[0];
    }
}