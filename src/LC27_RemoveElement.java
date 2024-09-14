public class LC27_RemoveElement {

    public int removeElement(int[] nums, int val) {
        // Two pointers approach
        // slow pointer is used to copy the elements which are not equal to val
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            // If the element is not equal to val, then we copy the element to the slow pointer
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }

    public static void main(String[] args) {
        LC27_RemoveElement obj = new LC27_RemoveElement();
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        System.out.println(obj.removeElement(nums, val));
    }
}
