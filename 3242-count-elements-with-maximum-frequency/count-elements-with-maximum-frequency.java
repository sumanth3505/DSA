class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max=0,res=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

       for (int x : map.values()) {
    if (x == max) {
        res += x;
    } else if (x > max) {
        max = x;
        res = x;
    }
}
        return res;
        
    }
}