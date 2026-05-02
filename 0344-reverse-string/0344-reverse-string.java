class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        char[]res = new char[n];
        int i = 0;
        int j = n - 1;
        while(i < j){
            swap(s,i,j);
            i++;
            j--;
        }
    }
    public static void swap(char[]s,int i,int j){
        char r = s[i];
        s[i] = s[j];
        s[j] = r;
    }
}