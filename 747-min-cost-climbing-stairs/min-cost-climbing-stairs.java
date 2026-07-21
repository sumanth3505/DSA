class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
     int[] dp=new int[n];
     
     for(int i=0;i<n;i++){
      if(i<2)dp[i]=cost[i];
       else if(dp[i-2]<dp[i-1])dp[i]=cost[i]+dp[i-2];
        else dp[i]=cost[i]+dp[i-1];
     }   
     return Math.min(dp[n-1],dp[n-2]);
    }
}