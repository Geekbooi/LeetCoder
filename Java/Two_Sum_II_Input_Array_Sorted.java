package Java;

public class Two_Sum_II_Input_Array_Sorted {

    public static int[] twoSum (int [] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum > target)
                right--;
            else if (sum < target) {
                left++;
            }
            else{
                return new int[] {left+1, right+1};
            }
        }
        return new int[] {left+1, right+1};
    }
    public static void main(String[] args) {
        int[] result = twoSum(new int[]{1, 3, 5, 7, 9, 13}, 12);
        System.out.println(result[0] + " " + result[1]);
    }
}
