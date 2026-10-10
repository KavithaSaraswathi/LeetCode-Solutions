class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int maxSum=sum;
        int j=0;
        int l= k-1;
        while(l<nums.length-1){
            sum=sum+nums[l+1]-nums[j];
            maxSum=Math.max(sum,maxSum);
            j++;
            l++;
        }
        double result=(double)maxSum/k;
        return result;
    }
}