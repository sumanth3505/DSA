class Solution {
    public int minimumFlips(int n) {
        StringBuilder f = new StringBuilder("");
        StringBuilder l = new StringBuilder("");
        int c=0;
       while(n!=0){
        f.append(n%2);
        l.insert(0,n%2);
        n=n/2;
       }
       for(int i=0;i<f.length();i++){
        if(f.charAt(i)!=l.charAt(i))c++;
       }
       return c;
    }
}