class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] arr={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set=new HashSet<>();
      
        for(String word:words){
            StringBuffer s=new StringBuffer();
            for(char c: word.toCharArray()){
                
                s.append(arr[c-'a']);
            
            }
            
             set.add(s.toString());
            
        }
        return set.size();
    }
}