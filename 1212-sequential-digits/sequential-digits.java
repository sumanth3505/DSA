class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
      List<Integer> li=new ArrayList<>();
      StringBuilder s=new StringBuilder("123456789");
      int l=(int)Math.log10(low)+1;
      int l1=(int)Math.log10(high)+1;
      int i=0,r=s.length()-1;
      while(l<=l1){
      while(i+l-1<=r){
        int c=Integer.parseInt(s.substring(i,i+l));
        if(c>=low){
        if(c<=high){
         
        li.add(c);
        i=i+1;
            
        }
        else return li;
        }
        else i++;

      }  
      l=l+1;
      i=0;
      }    
         return li;   
    }
}