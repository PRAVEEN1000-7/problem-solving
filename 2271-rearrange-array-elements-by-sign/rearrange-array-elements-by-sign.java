class Solution {
    public int[] rearrangeArray(int[] nums) {

        int n = nums.length/2;
        int[] positive =  new int[n];
        int[] negative = new int[n];
        
        int i=0,j=0;
        for(int ele : nums){
            if(ele>0){
                positive[i++] = ele;
            } else {
                negative[j++] = ele;
            }
        }

        int[] result = new int[nums.length];
        int p=0,k=0;
        for(int x=0;x<nums.length;x++){
            if(x%2==0){
                result[x] = positive[p];
                p++;
            } else {
                result[x] = negative[k];
                k++;
            }
        }
        return result;
    }
}