import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {

    boolean twice = false;    

    HashSet<Integer> set = new HashSet<>();

    for(int i=0;i<nums.length;i++){
        set.add(nums[i]);
    }
    if(nums.length!=set.size()) twice = true;

    return twice;
    
    }
}