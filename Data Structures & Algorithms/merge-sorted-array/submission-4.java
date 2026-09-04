class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left[] = new int[m];
        int right[] = new int[n];

        for(int a = 0;a<m;a++){
            left[a]=nums1[a];
        }
        for(int b = 0;b<n;b++){
            right[b]=nums2[b];
        }

        int idx=0, i=0,j=0;

        while (i < m && j < n) {

            if (left[i] <= right[j]) {
                nums1[idx] = left[i];
                i++;
            } else {
                nums1[idx] = right[j];
                j++;
            }

            idx++;
        }

        while(i<m){
            nums1[idx]=left[i];
            i++;
            idx++;
        }
        while(j<n){
            nums1[idx]=right[j];
            j++;
            idx++;
        }
    }
}