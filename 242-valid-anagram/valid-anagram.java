
class Solution {
    public boolean isAnagram(String s, String t) {
        
    List<Character> list = new ArrayList<>();

    for(char c : s.toCharArray()) {
        list.add(c);
    }

    boolean anagram = true;
    for(char c : t.toCharArray()) {
        if(list.contains(c)){
            list.remove(Character.valueOf(c));
        } else {
            anagram = false;
        }
    }

    return (list.isEmpty())? anagram : false ;
        
    }
}