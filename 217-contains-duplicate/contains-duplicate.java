import java.util.HashMap;

class Solution {
    public boolean containsDuplicate(int[] nums) {

    boolean twice = false;

    HashMap<Integer, Integer> map = new HashMap<>();

    for(int i=0;i<nums.length;i++){
        if(!map.containsKey(nums[i])){
            map.put(nums[i], 1);
        } else {
            twice = true;
            break;
        }
    }

    return twice;

    
    
    }
}