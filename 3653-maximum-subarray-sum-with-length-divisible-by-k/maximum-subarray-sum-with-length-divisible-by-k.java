class Solution {
    public long maxSubarraySum(int[] nums, int k) {
        long n=nums.length,inf=Long.MAX_VALUE/2;
        long[] miniS=new long[k];
        long pre=0,sum=-inf;
        for(int i=0;i<k-1;i++ )miniS[i]=inf;
        miniS[k-1]=0;
        for(int i=0;i<n;i++){
            pre=pre+nums[i];
            int ik=i%k;
            sum=Math.max(sum,pre-miniS[ik]);
            miniS[ik]=Math.min(pre,miniS[ik]);
        }
        return sum;
    }
}