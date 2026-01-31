class Solution {
    public boolean judgeCircle(String moves) {
     int i=0,j=0;
     for(char c:moves.toCharArray()){
        if(c=='U')i+=1;
        else if(c=='D')i+=-1;
        else if(c=='R')j+=1;
        else j+=-1;
     }   
     return i==0 && j==0;
    }
}