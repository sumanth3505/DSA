class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        
        int[] res=new int[n];
        if(n==1){
            res[0]=nums[0];
            return res;
        }
        for(int i=0;i<n;i++){
            int j=0;
            if(nums[i]>0){
                j=i+nums[i];
                if(j>=n)j=j%n;
                res[i]=nums[j];
            }
            else if(nums[i]<0){
                 j=i-(-nums[i]);
                 if(j<0){
                    j=Math.abs(j);
                    j=j%n;
                    
                    j=n-j;
                    if(j>=n)j%=j;
                 }
                 
                 res[i]=nums[j];
            }
            else res[i]=nums[i];
        }
        return res;
    }
}