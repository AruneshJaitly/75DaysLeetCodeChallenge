class Solution {
    public int maxProfit(int[] prices) {
        return maxprofit(prices);
    }
        public static int maxprofit(int[]arr) {
        int n = arr.length;
        int profit = 0;
        int maxprofit = 0;
        int cheap = arr[0];
        for(int i = 0; i<n; i++){
            if(cheap > arr[i]){
                cheap = arr[i];
            }
            profit = arr[i] - cheap;
            maxprofit = Math.max(profit,maxprofit);
        }
        return maxprofit;
    }
}