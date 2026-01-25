
        
        class Solution {
    public int[] rotateElements(int[] nums, int k) {
             List<Integer> non=new ArrayList<>();
        for(int x:nums){
            if(x>=0){
                non.add(x);
            }
        }
        int size=non.size();
        if(size==0){
            return nums;
        }
        k=k%size;
        int rotate[]=new int[size];
        for(int i=0;i<size;i++){
            rotate[i]=non.get((i+k)%size);
        }
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                nums[i]=rotate[idx++];

                    
            }
        }
        return nums;

    }
}
