class Solution {
    public boolean detectCapitalUse(String word) {
        int c=0;
      for(char i:word.toCharArray()){
        if(Character.isUpperCase(i)){
            c++;
        }
        else if(c>1) break;
      }
      if(c==1 && word.charAt(0)>=65 && word.charAt(0)<=96)return true;
      else if(c==word.length())return true;
      else if(c==0)return true;
      return false;

    }
}