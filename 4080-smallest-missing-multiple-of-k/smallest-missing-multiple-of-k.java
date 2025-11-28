class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        
        for (int i : nums) {
            if (i % k == 0) set.add(i);
        }
        
        int j = 1;
        while (set.contains(k * j)) {
            j++;
        }
        
        return k * j;
    }
}
