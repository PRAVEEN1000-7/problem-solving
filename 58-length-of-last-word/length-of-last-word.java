class Solution {
    public int lengthOfLastWord(String s) {
        
        char[] c = s.trim().toCharArray();

        int len=0;
        for(int i=c.length-1;i>=0;i--){
            if(c[i]!=' '){
                len++;
            } else {
                break;
            }
        }
        return len;
    }
}