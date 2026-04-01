class Solution {
    public boolean canBeEqual(String s1, String s2) {
    //   //  char c=s1.charAt(0);
    //    s1= s1.replace(s1.charAt(0),s1.charAt(2));
    //    // s1.charAt(2)=c;
    //     if(s1.equals(s2)){return true;}
    //    // c=s1.charAt(1);
    //    s1= s1.replace(s1.charAt(1),s1.charAt(3));
    //    // s1.charAt(3)=c;
    //     return s1.equals(s2);

      return (match(s1.charAt(0), s1.charAt(2), s2.charAt(0), s2.charAt(2)) &&
        match(s1.charAt(1), s1.charAt(3), s2.charAt(1), s2.charAt(3)));

   
    }
    boolean match(char a, char b, char c, char d) {
    return (a == c && b == d) || (a == d && b == c);
}
}