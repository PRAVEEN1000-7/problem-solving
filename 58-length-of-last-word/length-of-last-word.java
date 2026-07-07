class Solution {
    public int lengthOfLastWord(String s) {
        
        String[] sarr = s.split(" ");

        return sarr[sarr.length-1].length();

    }
}