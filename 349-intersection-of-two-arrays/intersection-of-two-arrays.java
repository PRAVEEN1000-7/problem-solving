import java.lang.Math;

class Solution {

    static int max(int[] arr){
        int max = arr[0];
        for(int i: arr) {
            max = Math.max(max, i);
        }
        return max;
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        
        int max1 = max(nums1);
        int max2 = max(nums2);
        int max = Math.max(max1, max2);

        int arr[] = new int[max+1];

        for(int i: nums1) arr[i]=1;

        int count=0;
        for(int i: nums2) {
            if(arr[i]==1) {
                arr[i]=2;
                count++;
            }
        }

        int[] result = new int[count];
        int pos=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                result[pos++]=i;
            }
        }

        return result;
    }
}