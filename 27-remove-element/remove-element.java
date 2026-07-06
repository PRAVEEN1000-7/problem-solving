class Solution {
    public int removeElement(int[] nums, int val) {
        
        int j=nums.length;

        for(int i=0;i<j;i++){
            if(nums[i]==val && nums[j-1]!=val){
                int temp = nums[i];
                nums[i] = nums[j-1];
                nums[j-1] = temp;
                j--;
            }
            else if(nums[i]==val && nums[j-1]==val){
                j--;
                i--;
            }
        }
        return j;
    }
}