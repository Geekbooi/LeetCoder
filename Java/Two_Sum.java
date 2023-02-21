package Java;

import java.util.Arrays;

public class Two_Sum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }

    //Method-1
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
                }
            }
        return null;
        }
    }

    /*
    Method-2
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int find = target-nums[i];
            if(map.containsKey(find)){
                return new int[] {map.get(find), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
     */

