class Solution {
    public int[] twoSum(int[] nums, int target) {
        return twosum(nums,target);
    }
    public static int[]twosum(int[]arr,int target){
        int n = arr.length;
        for(int i = 0; i<n;i++){
            for(int j = i+1; j<n; j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}