class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] arr=new int[26];
        for(char c:magazine.toCharArray()){
            arr[c-97]++;
        }
        for(char c:ransomNote.toCharArray()){
            if(arr[c-97]==0)return false;
            else arr[c-97]--;
        }
        return true;
    }
}