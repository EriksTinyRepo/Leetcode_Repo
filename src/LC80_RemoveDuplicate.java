public class LC80_RemoveDuplicate {


    public int lc80_removeDuplicates(int[] nums) {

        // Default case if the list is less or equal to 2
        if(nums.length <= 2) return nums.length;
        int windowSize = 2;
        for(int pointer = 2; pointer < nums.length; pointer++) {
            if(nums[pointer] != nums[windowSize - 2]) {
                //we remove the duplicate element if the first
                nums[windowSize] = nums[pointer];
                windowSize++;
            }
        }
        return windowSize;

    }

    public static void main(String[] args) {
        LC80_RemoveDuplicate obj = new LC80_RemoveDuplicate();
        int[] nums = {1, 1, 1, 1, 1, 2, 2, 3};
        System.out.println(obj.lc80_removeDuplicates(nums));
    }


}
