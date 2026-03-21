class Solution {
    public int removeDuplicates(int[] nums) {
        return removeduplicates(nums);
    }
    public static int removeduplicates(int[]arr){
        int N = arr.length;
        int k = 1;
        for(int i = 1; i<N; i++){
            if(arr[i] != arr[i-1]){
                arr[k] = arr[i];
                k++;
            }
        }
        return k;
    }
}