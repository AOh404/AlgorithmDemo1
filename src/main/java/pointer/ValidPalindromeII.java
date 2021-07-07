package pointer;

/**
 * 680. 验证回文字符串 Ⅱ
 * 给定一个非空字符串s，最多删除一个字符。判断是否能成为回文字符串。
 * <p>
 * 示例 1:
 * 输入: "aba"
 * 输出: True
 * <p>
 * 示例 2:
 * 输入: "abca"
 * 输出: True
 * 解释: 你可以删除c字符。
 * <p>
 * 注意:
 * <p>
 * 字符串只包含从 a-z 的小写字母。字符串的最大长度是50000。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-palindrome-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class ValidPalindromeII {

    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        char leftChar, rightChar;
        while (left < right) {
            leftChar = s.charAt(left);
            rightChar = s.charAt(right);
            if (leftChar != rightChar) {
                return validPalindrome(s, left + 1, right) || validPalindrome(s, left, right - 1);
            }
            ++left;
            --right;
        }
        return true;
    }

    private boolean validPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                ++left;
                --right;
            } else {
                return false;
            }
        }
        return true;
    }
}
