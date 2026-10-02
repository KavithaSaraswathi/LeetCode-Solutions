class Solution {
    public boolean isAnagram(String s, String t) {
        int [] num=new int[26];
        for(char c:s.toCharArray()){
            num[c-'a']++;
        }
        for(char c:t.toCharArray()){
            num[c-'a']--;
        }
        for(int i=0;i<26;i++){
            if(num[i]!=0){
                return false;
            }
        }
        return true;
    }
}
