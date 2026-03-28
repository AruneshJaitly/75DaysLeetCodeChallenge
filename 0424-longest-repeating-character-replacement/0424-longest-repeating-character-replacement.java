class Solution {
    static{
        for(int i = 0; i < 500; i++){
            characterReplacement("", 1);
        }
     }
    public static int characterReplacement(String s, int k) {
        int[] occurrence = new int[26];
        int left = 0, right = 0;
        int ans = 0;
        int maxOccurrence = 0;
        
        while(right < s.length()){
            maxOccurrence = Math.max(maxOccurrence, ++occurrence[s.charAt(right)-'A']);
            if(right - left + 1 - maxOccurrence > k){
                occurrence[s.charAt(left) - 'A']--;
                left++;
            }
            ans = Math.max(ans, right - left + 1);
            right++;
        }
        return ans;
    }
}