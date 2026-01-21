class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] arr={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set=new HashSet<>();
      
        for(String word:words){
            StringBuffer s=new StringBuffer("");
            for(int i=0;i<word.length();i++){
                int ind=word.charAt(i)-'a';
                s.append(arr[ind]);
            
            }
            if (set.contains(s))continue;
            else{
             set.add(s.toString());
            }
        }
        return set.size();
    }
}