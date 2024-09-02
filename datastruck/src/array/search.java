package array;

public class search {

    /*
    https://leetcode.cn/problems/binary-search/

     */

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int a = search(arr,1);
        System.out.println(a);
    }

    public static int search(int[] nums, int target) {
        // 避免当 target 小于nums[0] nums[nums.length - 1]时多次循环运算
        if (target < nums[0] || target > nums[nums.length - 1]) {
            return -1;
        }
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else { // nums[mid] > target
                right = mid - 1;
            }
        }
        // 未找到目标值
        return -1;
    }
}
