package array;

public class sortedSquares {

    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int left = 0;
        int right = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[right] * nums[right] <= nums[left] * nums[left]) {
                res[i] = nums[left] * nums[left];
                left++;
            } else {
                res[i] = nums[right] * nums[right];
                right--;
            }
        }
        return res;
    }

}
