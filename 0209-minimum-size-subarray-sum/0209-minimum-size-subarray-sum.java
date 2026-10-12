class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int window_sum=0;
        int min_length=Integer.MAX_VALUE;
        for (int right=0;right<nums.length;right++){
            window_sum+=nums[right];
            while(window_sum>=target){
                int length=right-left+1;
                min_length=Math.min(min_length,length);
                window_sum-=nums[left];
                left+=1;
            }
        }
        if(min_length==Integer.MAX_VALUE){
            return 0;
        }
        else{
            return min_length;
        }
    }
}