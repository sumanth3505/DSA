class Solution {
    public int residuePrefixes(String s) {
        int d=0,c=0;
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
        
        if(!set.contains(s.charAt(i))){
            set.add(s.charAt(i));
            d++;
            
            if((i+1)%3==d) c++;
        }
        else{
           if((i+1)%3==d) c++;
        }
        }
        return c;
    }
}