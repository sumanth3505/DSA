class Solution {
    public int minimumChairs(String s) {
        int cnt=0;
        int ans=0;
        char[] ch=s.toCharArray();
        for(char c:ch){
            if(c=='E'){
                cnt++;
            }
            else{
                cnt--;
            }
            ans=Math.max(cnt,ans);
        }
        return ans;
    }
}