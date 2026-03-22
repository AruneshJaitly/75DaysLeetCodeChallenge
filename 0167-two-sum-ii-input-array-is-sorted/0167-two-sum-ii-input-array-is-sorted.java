class Solution {
    public int[] twoSum(int[] numbers, int target) {
        return twosum(numbers,target);
    }
            public static int[] twosum(int[]arr,int target){
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while(i < j){
            int sum = arr[i] + arr[j];
            if(sum == target) return new int[]{i+1,j+1};
            else if(sum > target) j--;
            else if(sum < target) i++;
        }
        return new int[]{};
    }
}