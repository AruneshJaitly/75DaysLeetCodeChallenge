class Solution {
    public int majorityElement(int[] nums) {
        return vote(nums);
    }
        public static int vote(int []arr){
        int n = arr.length;
        int e = arr[0];
        int vote = 1;
        for(int i = 0; i<n; i++){
            if(arr[i] == e){
                vote++;
            }
            else{
                vote--;
                if(vote == 0){
                    vote = 1;
                    e = arr[i];
                }
            }
        }
        return e;
    }
}