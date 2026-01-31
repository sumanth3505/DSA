class Solution {
    public int countBinarySubstrings(String s) {
        // int n=s.length(),i=0,cnt=0;
        // ArrayList<Integer> arr= new ArrayList<>();
        // while(i<n){
        //     char ch=s.charAt(i);
        //     int c=0;
        //     while(i<n && s.charAt(i)==ch){
        //         c++;
        //         i++;
        //     }
        //     arr.add(c);
            
        // }
        // for(int j=1;j<arr.size();j++){
        //    cnt+=Math.min(arr.get(j),arr.get(j-1));
        // }
        // return cnt;

        int prevG=0,currG=1,res=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                currG++;
            }
            else{
                res+=Math.min(prevG,currG);
                prevG=currG;
                currG=1;
            }
        }
        res+=Math.min(prevG,currG);
        return res;

    }
}