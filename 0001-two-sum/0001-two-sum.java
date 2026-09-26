class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int temp=target-nums[i];
            if (map.containsKey(temp)){
                int[] ar={map.get(temp),i};
                return ar;
            }
            else{
                map.put(nums[i],i);
            }
        }
        int[] ar={};
        return ar;
    }
}