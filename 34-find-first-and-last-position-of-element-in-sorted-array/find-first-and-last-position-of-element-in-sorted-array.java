class Solution {

    static int findPosition(int nums[], int target, boolean first){

        int left = 0;
        int right = nums.length - 1;
        int position = -1;

        while(left<=right){
            int mid = (left+right)/2;

            if(nums[mid]==target){
                position = mid;

                if(first) right = mid - 1;
                else left = mid + 1;
            }

            else if(nums[mid]<target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return position;
    }

    public int[] searchRange(int[] nums, int target) {
        
        int first = findPosition(nums, target, true);
        int last = findPosition(nums, target, false);

        int result[] = {first, last};

        return result;
    
        
    }
}