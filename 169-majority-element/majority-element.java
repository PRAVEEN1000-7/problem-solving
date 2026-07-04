import java.util.*;

class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer, Integer> hash = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(hash.containsKey(nums[i])){
                hash.put(nums[i], hash.get(nums[i])+1);
            } else {
                hash.put(nums[i], 1);
            }
        }
        int maxkey=0;
        int maxvalue=0;
        for(Map.Entry<Integer, Integer> entry: hash.entrySet()){
            if(entry.getValue()> maxvalue){
                maxvalue = entry.getValue();
                maxkey = entry.getKey();
            }
        }
        return maxkey;

    }
}