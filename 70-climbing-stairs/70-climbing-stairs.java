class Solution {
    public int climbStairs(int n) {
        if(n < 2){
            return n;
        }
        int [] answer = new int[n];
        answer[0] = 1;
        answer[1] = 2;

        for (int i = 2; i < n ; i++) {
            answer[i] = answer[i-2] + answer[i-1];
        }

        return answer[n-1];
        
    }
}