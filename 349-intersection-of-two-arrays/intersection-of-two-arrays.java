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
        
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int i:nums1) set1.add(i);
        for(int i: nums2) set2.add(i);

        HashSet<Integer> set = new HashSet<>();
        for(int i:nums1) {
            if(set2.contains(i)){
                set.add(i);
            }
        }

        int[] arr = new int[set.size()];
        int i=0;
        for(Integer j : set) {
            arr[i] = j;
            i++;
        }

        return arr;
    }
}