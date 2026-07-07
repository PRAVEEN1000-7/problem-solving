import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        String s1 = new String(c1);
        String t1 = new String(c2);

        if(s1.equals(t1)) return true;
        else return false;
    }
}