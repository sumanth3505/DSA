class Solution {
    public int titleToNumber(String columnTitle) {
        int n=columnTitle.length(),sum=0;
        for(int i=0;i<n;i++){
            int k=columnTitle.charAt(n-1-i)-64;
            sum+=k*Math.pow(26,i);
        }
        return sum;
    }
}