package backtrack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class PermuteUnique {

    /*
    给定一个可包含重复数字的序列 nums ，按任意顺序 返回所有不重复的全排列。



示例 1：

输入：nums = [1,1,2]
输出：
[[1,1,2],
 [1,2,1],
 [2,1,1]]
示例 2：

输入：nums = [1,2,3]
输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
     */

    //存放结果
    List<List<Integer>> result = new ArrayList<>();
    //暂存结果
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] used = new boolean[nums.length];
        Arrays.fill(used, false);
        Arrays.sort(nums);
        backTrack(nums, used);
        return result;
    }

    private void backTrack(int[] nums, boolean[] used) {
        if (path.size() == nums.length) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            // used[i - 1] == true，说明同⼀树⽀nums[i - 1]使⽤过
            // used[i - 1] == false，说明同⼀树层nums[i - 1]使⽤过
            // 如果同⼀树层nums[i - 1]使⽤过则直接跳过
            if (i > 0 && nums[i] == nums[i - 1] && used[i - 1] == false) {
                continue;
            }
            //如果同⼀树⽀nums[i]没使⽤过开始处理
            if (used[i] == false) {
                used[i] = true;//标记同⼀树⽀nums[i]使⽤过，防止同一树枝重复使用
                path.add(nums[i]);
                backTrack(nums, used);
                path.remove(path.size() - 1);//回溯，说明同⼀树层nums[i]使⽤过，防止下一树层重复
                used[i] = false;//回溯
            }
        }
    }


    private List<List<Integer>> res = new ArrayList<>();
//    private List<Integer> path = new ArrayList<>();
    private boolean[] used = null;

//    public List<List<Integer>> permuteUnique(int[] nums) {
//        used = new boolean[nums.length];
//        Arrays.sort(nums);
//        backtracking(nums);
//        return res;
//    }

    // 集合去重
    public void backtracking(int[] nums) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        HashSet<Integer> hashSet = new HashSet<>();//层去重
        for (int i = 0; i < nums.length; i++) {
            if (hashSet.contains(nums[i]))
                continue;
            if (used[i] == true)//枝去重
                continue;
            hashSet.add(nums[i]);//记录元素
            used[i] = true;
            path.add(nums[i]);
            backtracking(nums);
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }

}
