class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Set<Integer> s=new HashSet<>();
        List<Integer> l=new ArrayList<>();
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i:nums){
            s.add(i);
            if(i<min){
                min=i;
            }
            if(i>max)max=i;
            
        }
        for(int i=min+1;i<max;i++){
            if(!s.contains(i)){
            l.add(i);
            }
        }
        return l;

    }
}