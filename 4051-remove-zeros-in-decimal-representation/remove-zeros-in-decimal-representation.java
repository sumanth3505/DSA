class Solution {
    public long removeZeros(long n) {
        long i=1,s=0;
        while(n!=0){
            long r=n%10;
            if(r!=0){
                s=s+r*i;
                i=i*10;
            }
            n/=10;
        }
        return s;
    }
}