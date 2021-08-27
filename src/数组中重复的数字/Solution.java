package 数组中重复的数字;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> temp = new HashSet<>();
        for (int num : nums) {
            if (temp.contains(num)) return num;
            temp.add(num);
        }
        return -1;
    }

}
