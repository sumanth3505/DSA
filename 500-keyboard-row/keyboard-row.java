import java.util.*;

class Solution {
    public String[] findWords(String[] words) {

        String s1 = "qwertyuiopQWERTYUIOP";
        String s2 = "asdfghjklASDFGHJKL";
        String s3 = "zxcvbnmZXCVBNM";

        List<String> list = new ArrayList<>();

        for (String word : words) {

            char first = word.charAt(0);
            int count = 0;

            if (s1.indexOf(first) != -1) {
                for (char ch : word.toCharArray()) {
                    if (s1.indexOf(ch) != -1) count++;
                    else break;
                }
            }
            else if (s2.indexOf(first) != -1 ) {
                for (char ch : word.toCharArray()) {
                    if (s2.indexOf(ch) != -1) count++;
                    else break;
                }
            }
            else {
                for (char ch : word.toCharArray()) {
                    if (s3.indexOf(ch) != -1) count++;
                    else break;
                }
            }

            if (count == word.length()) {
                list.add(word);
            }
        }

        return list.toArray(new String[0]);
    }
}
