class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)return "";
     String ans=strs[0];
     int j,k;
     for(int i=1;i<strs.length;i++){
        j=0;
        k=0;
        String s=strs[i];
        while(j<ans.length() && k<s.length()){
           if(s.charAt(k)==ans.charAt(j)){
            j++;
            k++;
           }
           else break;
        }
        if(j==0)return "";
        ans=ans.substring(0,j);
     }
    return ans;
    } 
}