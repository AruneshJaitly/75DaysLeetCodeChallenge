class Solution {
    public int searchInsert(int[] nums, int target) {
        return search(nums,target);
    }
        public static int search(int []arr , int target){
        int i = 0 , j = arr.length - 1;
        while(i <= j){
            int mid = i + (j - i)/2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                i = mid + 1;
            }
            else{
                j = mid - 1;
            }
        }
        return i;
    }
}