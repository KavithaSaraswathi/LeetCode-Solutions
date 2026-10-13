class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        String sub="";
        int long_len=0;
        for(int right=0;right<s.length();right++){
            while (sub.contains(String.valueOf(s.charAt(right)))){
                sub=sub.substring(1);
                left++;
            }
            sub+=s.charAt(right);
            int current_len=sub.length();
            long_len=Math.max(long_len,current_len);

        }
        return long_len;
    }
}