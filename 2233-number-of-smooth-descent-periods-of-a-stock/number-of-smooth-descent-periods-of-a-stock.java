class Solution {
    public long getDescentPeriods(int[] prices) {
        int l=0;
        long ans=0;
        for(int r=0;r<prices.length;r++){
          if(r>0 && prices[r]!=prices[r-1]-1){
            l=r;
          }
          ans+=(r-l+1);
        }
        return ans;
    }
}