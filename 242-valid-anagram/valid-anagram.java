import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()) return false;

        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();

        int[] arr = new int[26];

        for(int i=0;i<c1.length;i++) {
            arr[c1[i]-'a']++;
            arr[c2[i]-'a']--;
        }

        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                return false;
            }
        }

        return true;    
    }
}