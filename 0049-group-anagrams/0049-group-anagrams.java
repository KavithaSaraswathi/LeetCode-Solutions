class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0){
            return null;
        }
        HashMap<String,List<String>> map=new HashMap<>();
        for(String s:strs){
            char[] h=s.toCharArray();
            Arrays.sort(h);
            String st=new String(h);
            if(map.containsKey(st)){
                map.get(st).add(s);
            }
            else{
                map.put(st,new ArrayList<>());
                map.get(st).add(s);
            }
        }

        List<List<String>> result=new ArrayList<>();
        for(List<String> val:map.values()){
            result.add(val);
        }
        return result;
    }
}