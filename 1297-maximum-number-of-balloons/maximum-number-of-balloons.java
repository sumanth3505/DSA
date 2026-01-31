class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] li = new int[26];
        for(char c:text.toCharArray()){
            li[c-'a']++;
        }
        int b = li['b' - 'a'];
        int a = li['a' - 'a'];
        int l = li['l' - 'a'] / 2;
        int o = li['o' - 'a'] / 2;
        int n = li['n' - 'a'];

        return Math.min(b, Math.min(a, Math.min(l, Math.min(o, n))));
    }
}