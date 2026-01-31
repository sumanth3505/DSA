class Solution {
    public int countBinarySubstrings(String s) {
        int n=s.length(),i=0,cnt=0;
        ArrayList<Integer> arr= new ArrayList<>();
        while(i<n){
            char ch=s.charAt(i);
            int c=0;
            while(i<n && s.charAt(i)==ch){
                c++;
                i++;
            }
            arr.add(c);
            
        }
        for(int j=1;j<arr.size();j++){
           cnt+=Math.min(arr.get(j),arr.get(j-1));
        }
        return cnt;
    }
}