class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        Integer res;
        for(int i = 0; i<nums.length; i++){
            res = map.get(nums[i]);
            if(res != null){
                return new int[]{res, i};
            }else{
                map.put(target - nums[i], i);
            }
        }
        return new int[] {1,2};
    }
}