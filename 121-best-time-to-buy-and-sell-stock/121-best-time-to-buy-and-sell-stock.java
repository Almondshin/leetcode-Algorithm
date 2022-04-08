class Solution {
    public int maxProfit(int[] prices) {
        int answer = 0;
        int temp = prices[0];
        for(int i = 1; i < prices.length; i++){
            if(prices[i] < temp ){
                temp = prices[i];
            }else if(prices[i] - temp > answer){
                answer = prices[i] - temp;
            }
        }
        return answer;
    }
}