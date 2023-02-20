package Java;

import java.sql.Array;
import java.util.Arrays;

public class Contains_Duplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 1};
        System.out.println("Distinct element " + containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1])
                return true;
        }
        return false;
    }
}
