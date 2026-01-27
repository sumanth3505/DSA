class Solution {
    public String largestEven(String s) {
     StringBuilder str=new StringBuilder(s);
     for(int i=str.length()-1;i>=0;i--){
        if(str.charAt(i)=='2')return str.toString();
        str.deleteCharAt(i);
     }
     return "";
    }
}