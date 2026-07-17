class Solution {
    public long gcdSum(int[] nums) {
        int[] prefixGcd=new int[nums.length];
        long sum=0;
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
            int k=nums[i];
            int t=max;
            while(t!=0){
                int r=k%t;
                k=t;
                t=r;
            }
            prefixGcd[i]=k;
        }
        Arrays.sort(prefixGcd);
        for(int i=0;i<prefixGcd.length/2;i++){
           int n1= prefixGcd[i];
           int n2=prefixGcd[prefixGcd.length-i-1];
            while(n2!=0){
                int r=n1%n2;
                n1=n2;
                n2=r;
            }
            sum+=n1;
        }
       return sum;
    }
}