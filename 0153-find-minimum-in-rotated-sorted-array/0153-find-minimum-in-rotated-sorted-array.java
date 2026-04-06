class Solution {
    public int findMin(int[] nums) {
        return Min(nums);
    }
    public static int Min(int arr[]){
        int Min = Integer.MAX_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(Min > arr[i]){
                Min = arr[i];
            }
        }
        return Min;
    }
}