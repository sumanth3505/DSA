class Solution {
    public int gcdOfOddEvenSums(int n) {
        int n1=(int)Math.pow(n,2);
        int n2=n*(n+1);
        while(n2!=0){
            int r=n1%n2;
            n1=n2;
            n2=r;
        }
        return n1;
    }
}