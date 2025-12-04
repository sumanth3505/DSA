class Solution {
    private static final int MOD = 1_000_000_007;
    public int countTrapezoids(int[][] points) {
        
        HashMap<Integer,Long> map=new HashMap<>();
        long pSum=0, ans=0;
        for(int i=0;i<points.length;i++){
            int y = points[i][1];
            map.put(y, map.getOrDefault(y, 0L) + 1);
        }
        for(long x:map.values()){
            // c=x>2?x*c:c;
            if(x>1){
                long seg=(x*(x-1)/2)%MOD;
                ans=(ans+(pSum*seg))%MOD;
                pSum+=seg;
            }
        }
        return (int)ans;
    }
}