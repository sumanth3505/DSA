class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        if(s.length()!=t.length())return false;
        int j=0;
        while(j<s.length()){
            char c=s.charAt(j);
            if(map.containsKey(c) ){
                 if(map.get(c)!=t.charAt(j)){
               return false;
            }
            
            } 
            else{
                if(map.containsValue(t.charAt(j)))return false;
                map.put(c,t.charAt(j));
            }
            j++;
        }
        return true;
    }
}