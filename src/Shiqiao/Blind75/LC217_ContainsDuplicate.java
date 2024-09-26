package Shiqiao.Blind75;
import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums, return true if any value appears
 * more than once in the array, otherwise return false.
 */
public class LC217_ContainsDuplicate {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> unique = new HashSet<>();
        for (int num : nums) {
            if (unique.contains(num)) {
                return true;
            } else {
                unique.add(num);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LC217_ContainsDuplicate lc = new LC217_ContainsDuplicate();
        System.out.println(lc.hasDuplicate(new int[]{1, 2, 3, 1}));
        System.out.println(lc.hasDuplicate(new int[]{1, 2, 3, 4}));
        System.out.println(lc.hasDuplicate(new int[]{1, 1, 1, 1}));
    }
}
