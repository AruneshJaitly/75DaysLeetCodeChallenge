class Solution {
    public void moveZeroes(int[] nums) {
        move(nums);
    }
        public static void move(int[]arr){
        int i = 0,j = 0;
        int N = arr.length;
        while(i < N && j < N){
            if(arr[j] != 0){
                swap(arr,i,j);
                i++;
                j++;
            }
            else{
                j++;
            }
        }
    }
    public static void swap(int[]arr,int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}