class Solution {
    public int majorityElement(int[] nums) {
        int temp = nums[0];
        int count = 0;
        
        // [2,2,1,1,1,2,2]
        // count 1 , 2 1 ,0  -1 ,0 1
        
        // [10,9,9,9,10]
        // count -1 0 1 2 1
        
        //[1,3,1,1,4,1,1,5,1,1,6,2,2]
        // count 1 0 1 2 1 2 3 2 3 4 3 2 1
        

        
        for(int i = 0; i < nums.length; i++){
           
            if(count <= 0){
                temp = nums[i];
                count = 0;
            }
            
             if(temp == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return temp;
    }
}