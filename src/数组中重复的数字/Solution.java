package 数组中重复的数字;

class Solution {
    public int findRepeatNumber(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]==nums[j]){
                    return nums[i];
                }
            }
        }
        return nums[0];
    }

}
