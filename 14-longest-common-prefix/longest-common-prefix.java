class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        String s1 = null;
        String prefix = new String();

        if(strs.length ==1) return strs[0];

        outerloop:
        for(int i=1;i<=strs[0].length();i++){
            s1 = strs[0].substring(0,i);
           

            for(int j=1;j<strs.length;j++){
                if(strs[j].length()<i || !s1.equals(strs[j].substring(0,i))){
                    break outerloop;
                }
            }
            prefix = s1;
        }
        return prefix;
    }
}