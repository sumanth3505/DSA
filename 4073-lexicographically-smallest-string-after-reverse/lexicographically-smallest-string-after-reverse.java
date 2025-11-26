class Solution {
    public String lexSmallest(String s) {
        int n=s.length();
        String pre=s.substring(0,1);
        String suf=s.substring(n-1,n);
        String ans=s;
        for(int i=1;i<n;i++){
            pre=s.charAt(i)+pre;
            String str=pre+s.substring(i+1);
            if(ans.compareTo(str)>0)ans=str;
        }
        for(int i=n-2;i>=0;i--){
            suf=suf+s.charAt(i);
            String str=s.substring(0,i)+suf;
            if(ans.compareTo(str)>0)ans=str;
        }
        return ans;
    }
}