class Solution {
    public int passThePillow(int n, int time) {
        int c=1;
        boolean f=true;
        for(int i=1;i<=time;i++){
            if(f){
          c=c+1;
            if(c>=n)f=false;
            }
            else{
                c=c-1;
                if(c<=1){
                    f=true;
                }
            }
        }
        return c;
    }
}