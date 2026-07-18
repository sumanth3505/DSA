class Solution {
    public int waviness(int n){
        String s=Integer.toString(n);
        int cnt=0;
        for(int i=1;i<s.length()-1;i++){
            if((s.charAt(i-1)>s.charAt(i) && s.charAt(i+1)>s.charAt(i))
            || (s.charAt(i-1)<s.charAt(i) && s.charAt(i+1)<s.charAt(i)) ){
                cnt++;
            }
        }
        return cnt;
    }
    public int totalWaviness(int num1, int num2) {
        int ans=0;
        for(int i=num1;i<=num2;i++){
             ans=ans+waviness(i);
        }
        return ans;
    }
}