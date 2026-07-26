class Solution {
    public boolean isSubsequence(String s, String t) {


        int sl = 0;
        for(int i=0;i<t.length();i++){
            if(sl>s.length()-1) break;

            if(s.charAt(sl)==t.charAt(i)) {
                sl++;
            }
        }

        return (sl==s.length())?  true : false;
        
    }
}