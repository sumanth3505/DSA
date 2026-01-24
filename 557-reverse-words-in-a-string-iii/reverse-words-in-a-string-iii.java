class Solution {
    public String reverseWords(String s) {
        String[] s1=s.split(" ");
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s1.length;i++){
            StringBuilder sb=new StringBuilder(s1[i]);
            sb.reverse();
            str.append(sb.toString());
            if(i<s1.length-1){
                str.append(" ");
            }
        }
        return str.toString();
       
    }
}