package array;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        if (nums == null) {
            return null;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int expected = target - nums[i];
            if (map.containsKey(expected)) {
                return new int[]{i, map.get(expected)};
            }
            map.put(nums[i], i);
        }
        return nums;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        System.out.println(Arrays.toString(twoSum.twoSum(new int[]{1, 2, 3, 4, 5, 0}, 9)));
    }

}
