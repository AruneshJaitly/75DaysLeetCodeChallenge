class Solution {
    public int[] productExceptSelf(int[] nums) {
        return product(nums);
    }
        public static int[] product(int []arr){
        int n = arr.length;
        int []leftt = new int[n];
        leftt[0] = 1;
        for(int i = 1; i<n; i++){
            leftt[i] = leftt[i-1] * arr[i-1];
        }
        int []right = new int[n];
        right[n-1] = 1;
        for(int i = n-2; i>=0; i--){
            right[i] = right[i+1] * arr[i+1];
        }
        for(int i = 0; i<n; i++){
            leftt[i] = right[i] * leftt[i];
        }
        return leftt;
    }
}