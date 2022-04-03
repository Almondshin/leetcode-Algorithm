class Solution {
    public int searchInsert(int[] nums, int target) {
		int answer = 0;
		for (int i = 0; i < nums.length; i++) {
			if (target == nums[i]) {
				answer = i;
				break;
			} else if (nums[i] < target) {
				answer = i + 1;
			}
		}
		return answer;
    }
}