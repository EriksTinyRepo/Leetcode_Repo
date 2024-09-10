public class LC189_RotateArray {

    public void rotate(int[] nums, int k) {

        int len = nums.length;

        // if k is greater than the length of the array
        k = k % len;

        // Reverse the whole array
        reverse(0, len - 1, nums);
        // Reverse the first k elements
        reverse(0,k-1, nums);
        // Reverse the rest of the elements
        reverse( k, len - 1, nums);

    }

    public void reverse(int start, int end, int[] nums){

        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        LC189_RotateArray obj = new LC189_RotateArray();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        obj.rotate(nums, 3);
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }


}
