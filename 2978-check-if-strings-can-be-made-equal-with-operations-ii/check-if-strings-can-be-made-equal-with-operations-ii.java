class Solution {
    public boolean checkStrings(String s1, String s2) {
        List<Character> l1=new ArrayList<Character>();
        List<Character> l2=new ArrayList<Character>();
        List<Character> l3=new ArrayList<Character>();
        List<Character> l4=new ArrayList<Character>();

        for(int i=0;i<s1.length();i+=2){
            l1.add(s1.charAt(i));
        }
        for(int i=1;i<s1.length();i+=2){
            l2.add(s1.charAt(i));
        }
        for(int i=0;i<s2.length();i+=2){
            l3.add(s2.charAt(i));
        }
        for(int i=1;i<s2.length();i+=2){
            l4.add(s2.charAt(i));
        }
         Collections.sort(l1);
        Collections.sort(l2);
        Collections.sort(l3);
        Collections.sort(l4);

        return l1.equals(l3) && l2.equals(l4);
    }
    
}