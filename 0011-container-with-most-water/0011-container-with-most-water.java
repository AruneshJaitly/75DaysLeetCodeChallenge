class Solution {
    public int maxArea(int[] height) {
        return container(height);
    }
        public static int container(int []arr){
        int left = 0;
        int right = arr.length-1;
        int maxsum = 0;
        while(left < right){
            int h = Math.min(arr[left],arr[right]);
            int width = right - left;
            maxsum = Math.max(maxsum,h*width);
            if(arr[left]<arr[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxsum;
    }
}