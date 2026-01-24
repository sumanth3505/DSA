class Solution {
    public String reverseWords(String s) {
        String[] s1=s.split(" ");
        StringBuilder str=new StringBuilder();
        for(int i=0;i<s1.length;i++){
            StringBuilder sb=new StringBuilder(s1[i]);
            sb.reverse();
            str.append(sb.toString());
            str.append(" ");
        }
        
        str.deleteCharAt(str.length()-1);   
        return str.toString();
    //    StringBuilder s=new StringBuilder(str);
    //    int prev=0;
    //    for(int i=0;i<s.length();i++){
    //     if(s.charAt(i)==' '){
    //         String sub=s.substring(prev,i);
    //         sub=new StringBuilder(sub).reverse().toString();
    //         s.replace(prev,i,sub);
    //         prev=i+1;
    //     }
    //     if(i==s.length()-1){
    //         String sub=s.substring(prev,i+1);
    //         sub=new StringBuilder(sub).reverse().toString();
    //         s.replace(prev,i+1,sub);
    //     }
    //    }
    //    return s.toString();
    }
}