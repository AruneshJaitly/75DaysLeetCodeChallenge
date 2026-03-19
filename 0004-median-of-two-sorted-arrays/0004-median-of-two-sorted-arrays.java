class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return median(nums1,nums2);
    }
    public static double median(int[]a,int[]b){
        int m = a.length;
        int n = b.length;
        int []c = new int[m+n];
        int i = 0,j = 0,k = 0;
        while(i < m && j < n){
            if(a[i] <= b[j]){
                c[k++] = a[i++];
            }
            else{
                c[k++] = b[j++];
            }
        }
        while(i < m){
            c[k++] = a[i++];
        }
        while(j < n){
            c[k++] = b[j++];
        }
        int N = c.length;
        double me;
        if(N % 2 == 0){
            me = (c[N/2] + c[N/2 - 1])/2.0; 
        }
        else{
            me = c[N/2];
        }
        return me;
    }
}