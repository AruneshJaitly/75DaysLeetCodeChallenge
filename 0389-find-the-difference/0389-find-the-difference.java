class Solution {
    public char findTheDifference(String s, String t) {
        return difference(s,t);
    }
    public static char difference(String s , String t){
        char result = 0;
        for(char c : s.toCharArray()){
            result ^= c;
        }
        for(char c : t.toCharArray()){
            result ^= c;
        }
        return result;
    }
}