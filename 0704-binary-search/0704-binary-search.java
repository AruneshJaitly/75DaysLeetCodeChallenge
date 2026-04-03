class Solution {
    public int search(int[] nums, int target) {
        return search_num(nums,target);
    }
    public static int search_num(int[] arr, int target) {
        int n = arr.length;
        int lo = 0;
        int hi = n-1;
        while(lo <= hi){
            int m = lo + (hi-lo)/2;
            if(arr[m] == target) return m;
            else if (arr[m] > target){
                hi = m - 1;
            }
            else if(arr[m] < target) {
                lo = m + 1;
            }
        }
        return -1;
    }
}