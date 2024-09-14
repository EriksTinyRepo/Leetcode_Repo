public class LC88_MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // i points to the last element of nums1
        // j points to the last element of nums2
        // idx points to the last element of the merged array
        int i = m-1, j = n-1, idx = m+n-1;

        // merge the two arrays from the end
        while(i >= 0 && j >= 0) {
            if(nums1[i] > nums2[j]) {
                // copy the element from nums1 to the merged array
                nums1[idx--] = nums1[i--];
            } else {
                // copy the element from nums2 to the merged array
                nums1[idx--] = nums2[j--];
            }
        }
        // copy the remaining elements from nums2 to the merged array
        while(j >= 0) {
            nums1[idx--] = nums2[j--];
        }
    }

    public static void main(String[] args) {
        LC88_MergeSortedArray obj = new LC88_MergeSortedArray();
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        obj.merge(nums1, 3, nums2, 3);
        for(int num : nums1) {
            System.out.print(num + " ");
        }
    }

}
