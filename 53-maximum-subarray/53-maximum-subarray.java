class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxVal = Integer.MIN_VALUE;
        
        if(nums.length == 1){
            return nums[0];
        }
        for(int i = 0; i<nums.length; i++){
            if(sum < 0){
                sum = nums[i];
            }else{
                sum += nums[i];
            }
            if(maxVal < sum){
                maxVal = sum;
            }
        }
        return maxVal;
    }
}