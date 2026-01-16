class Solution {
    public String reverseVowels(String s) {
      HashMap<Integer,Character> map=new HashMap<>();
      StringBuilder sb=new StringBuilder("");
      int i=0;
        for(char c: s.toCharArray()){
            if(c=='a' || c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U'){
              i++;
              map.put(i,c);
            }
        }
        for(char c: s.toCharArray()){
            if(c=='a' || c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='o'||c=='O'||c=='u'||c=='U'){
              
              sb.append(map.get(i));
              i--;
            }
            else sb.append(c);
        }
        return sb.toString();
    }
}