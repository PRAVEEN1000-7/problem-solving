class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if((c>='a' && c<='z') ||
               (c>='0' && c<='9')) {
                sb.append(c);
               } 
        }
        s = sb.toString();
        int n=s.length();
        System.out.println(s +" "+n);
        int i = 0;
        while(i<n-i-1) {
            if(s.charAt(i)!=s.charAt(n-i-1)){
                return false;
            }
            i++;
        }     
        return true;        
    }
}