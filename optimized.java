import java.util.HashMap;
import java.util.Map;
 
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int x = 0; x < nums.length; x++) {
            if (numToIndex.containsKey(target - nums[x])) {
                return new int[] {numToIndex.get(target - nums[x]), x};
            }
            numToIndex.put(nums[x], x);
        }
        return new int[] {};
    }
}
