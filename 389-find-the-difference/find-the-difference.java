class Solution {
    public char findTheDifference(String s, String t) {
        //boolean[] seen=new boolean[s.length()];
        char res=0;
        for(int i=0;i<s.length();i++){
         res=(char)(res^s.charAt(i));
        }
        for(int i=0;i<t.length();i++){
         res=(char)(res^t.charAt(i));
        }
        return res;
    }
}