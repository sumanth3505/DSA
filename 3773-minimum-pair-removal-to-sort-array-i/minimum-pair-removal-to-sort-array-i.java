class Solution {
    public int minimumPairRemoval(int[] nums) {
        boolean f;
        int minS;
        int sum,ind,c=0;
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            l.add(nums[i]);
        }
        while(l.size()!=0){
            f=false;
            sum=0;
            minS=Integer.MAX_VALUE;
            ind=-1;
        for(int i=0;i<l.size()-1;i++){

        if(l.get(i)>l.get(i+1)){
            f=true;
        }
        sum=l.get(i)+l.get(i+1);
        
        if(minS>sum){
            minS=sum;
            ind=i;
        }
        }
        if(!f){
            return c;
        }
        l.set(ind,minS);
        l.remove(ind+1);
        c++;
        }
        return -1;
    }
}