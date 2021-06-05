public class MedianOfTwoSortedArrays_4 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;
        if(((m+n)&1)==0){
            int median1 = findMedian(nums1,nums2,0, m-1, ((m+n)/2)-1,(m+n)/2);
            if(median1==-1){
                median1= findMedian(nums2,nums1,0,n-1, ((m+n)/2)-1,(m+n)/2);
            }

            int median2 = findMedian(nums1,nums2,0, m-1, (m + n)/2,((m+n)/2)-1);
            if(median2==-1){
                median2 = findMedian(nums2,nums1,0,n-1, (m + n)/2,((m+n)/2)-1);
            }
            return (median1+median2)/2.0;
        }else{
            int median = findMedian(nums1,nums2,0, m-1, (m + n)/2,(m+n)/2);
            if(median==-1){
                median = findMedian(nums2,nums1,0,n-1, (m + n)/2,(m+n)/2);
            }
            return median;
        }
    }

    public int findMedian(int[] nums1, int[] nums2, int l, int r, int lExpected, int rExpected) {
        if(l>r){
            return -1;
        }
        int mid = (l+r)/2;
        int lActual = mid;
        int rActual = nums1.length-mid-1;
        int index = findIndexInSortedArray(nums2,0,nums2.length-1,nums1[mid]);
        lActual+=index;
        rActual+=(nums2.length-index);
        if(index<nums2.length && nums2[index] == nums1[mid]){
            lActual++;rActual--;
        }
        if(lActual==lExpected && rActual==rExpected){
            return nums1[mid];
        }
        if(lActual>rActual)
            return findMedian(nums1,nums2,l,mid-1,lExpected,rExpected);
        return findMedian(nums1,nums2,mid+1,r,lExpected,rExpected);
    }

    public int findIndexInSortedArray(int[] arr, int l, int r, int val) {
        int mid = (l + r) / 2;
        if (l > r) {
            return l;
        }
        if (val <= arr[mid]) {
            return findIndexInSortedArray(arr, l, mid - 1, val);

        }
        return findIndexInSortedArray(arr, mid + 1, r, val);
    }
}
