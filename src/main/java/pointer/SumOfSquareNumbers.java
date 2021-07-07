package pointer;

/**
 * 633. 平方数之和
 * 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得a2 + b2 = c 。
 * <p>
 * 示例 1：
 * 输入：c = 5
 * 输出：true
 * 解释：1 * 1 + 2 * 2 = 5
 * <p>
 * 示例 2：
 * 输入：c = 3
 * 输出：false
 * <p>
 * 示例 3：
 * 输入：c = 4
 * 输出：true
 * <p>
 * 示例 4：
 * 输入：c = 2
 * 输出：true
 * <p>
 * 示例 5：
 * 输入：c = 1
 * 输出：true
 * <p>
 * 提示：
 * 0 <= c <= 2^31 - 1
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/sum-of-square-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SumOfSquareNumbers {

    // 使用 sqrt 函数
    public boolean judgeSquareSumSqrt(long c) {
        for (long num1 = 0; num1 * num1 <= c; ++num1) {
            double num2 = Math.sqrt(c - num1 * num1);
            if (num2 == (int) num2) {
                return true;
            }
        }
        return false;
    }

    // 双指针
    public boolean judgeSquareSumPointer(long c) {
        long right = (int) Math.sqrt(c);
        if (right * right == c) {
            return true;
        }

        long left = 0;
        while (left <= right) {
            long sum = left * left + right * right;
            if (sum == c) {
                return true;
            } else if (sum < c) {
                ++left;
            } else {
                --right;
            }
        }
        return false;
    }
}
