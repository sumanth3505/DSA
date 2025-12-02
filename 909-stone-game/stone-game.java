class Solution {
    public boolean stoneGame(int[] piles) {
        int i=0,j=piles.length-1,c=0,c1=0,t=1;
        while(i<=j){
            if(t%2==1){
            if(piles[i]>piles[j]){c+=piles[i];i++;}
            else c+=piles[j];j--;
            }
            else{
              if(piles[i]<piles[j]){c1+=piles[i];i++;}
            else c1+=piles[j];j--;
            }
            t++;
        }
        return c>c1?true:false;
    }
}