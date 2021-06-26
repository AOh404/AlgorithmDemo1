package avarice;

/**
 * 665. 非递减数列
 * 给你一个长度为 n 的整数数组，请你判断在最多改变 1 个元素的情况下，该数组能否变成一个非递减数列。
 * <p>
 * 我们是这样定义一个非递减数列的：对于数组中任意的i (0 <= i <= n-2)，总满足 nums[i] <= nums[i + 1]。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [4,2,3]
 * 输出: true
 * 解释: 你可以通过把第一个4变成1来使得它成为一个非递减数列。
 * <p>
 * 示例 2:
 * <p>
 * 输入: nums = [4,2,1]
 * 输出: false
 * 解释: 你不能在只改变一个元素的情况下将其变为非递减数列。
 * <p>
 * 提示：
 * <p>
 * 1 <= n <= 10 ^ 4
 * - 10 ^ 5 <= nums[i] <= 10 ^ 5
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/non-decreasing-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class NonDecreasingArray {
    public boolean checkPossibility(int[] nums) {
        int invalidElement = 0;

        int current;
        int next;
        for (int i = 0, lastIndex = nums.length - 1; i < lastIndex; i++) {
            current = nums[i];
            next = nums[i + 1];

            if (current > next) {
                ++invalidElement;
                if (invalidElement > 1) {
                    return false;
                }

                // 当 current > next 时, 因为 current 需要大于 prev，则 current 为 next最佳
                // prev <= current && current <= next, 所以 prev <= next
                if (i > 0 && nums[i - 1] > next) {
                    nums[i + 1] = current;
                }
            }
        }
        return true;
    }
}
