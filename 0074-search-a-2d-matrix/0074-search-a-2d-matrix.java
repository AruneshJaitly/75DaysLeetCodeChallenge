class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return search_2(matrix,target);
    }
        public static boolean search_2(int[][] arr, int target) {
        int i = 0;
        int j = arr[0].length - 1;
        while(i<arr.length && j>=0){
            if(arr[i][j] == target){
                return true;
            }
            else if(arr[i][j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
}