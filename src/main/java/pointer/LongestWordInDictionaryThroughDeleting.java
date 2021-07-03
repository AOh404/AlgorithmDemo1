package pointer;

import java.util.List;

/**
 * 给你一个字符串 s 和一个字符串数组 dictionary 作为字典，找出并返回字典中最长的字符串，该字符串可以通过删除 s 中的某些字符得到。
 * <p>
 * 如果答案不止一个，返回长度最长且字典序最小的字符串。如果答案不存在，则返回空字符串。
 * <p>
 * 示例 1：
 * 输入：s = "abpcplea", dictionary = ["ale","apple","monkey","plea"]
 * 输出："apple"
 * <p>
 * 示例 2：
 * 输入：s = "abpcplea", dictionary = ["a","b","c"]
 * 输出："a"
 * <p>
 * 提示：
 * 1 <= s.length <= 1000
 * 1 <= dictionary.length <= 1000
 * 1 <= dictionary[i].length <= 1000
 * s 和 dictionary[i] 仅由小写英文字母组成
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-word-in-dictionary-through-deleting
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LongestWordInDictionaryThroughDeleting {

    // 排序并检查子序列
    public String findLongestWordSortCheckSubStr(String s, List<String> dictionary) {
        dictionary.sort((o1, o2) -> o1.length() == o2.length() ? o1.compareTo(o2) : o2.length() - o1.length());

        for (String subStr : dictionary) {
            if (isSubString(s, subStr)) {
                return subStr;
            }
        }
        return "";
    }

    // 不需要排序
    public String findLongestWordWithoutSort(String s, List<String> dictionary) {
        String max = "";
        for (String subStr : dictionary) {
            if (isSubString(s, subStr) && (max.length() < subStr.length() || (max.length() == subStr.length() && max.compareTo(subStr) > 0))) {
                max = subStr;
            }
        }
        return max;
    }

    private boolean isSubString(String fullStr, String subStr) {
        int fullStrIndex = 0;
        int subStrIndex = 0;

        int fullLength = fullStr.length();
        int subLength = subStr.length();
        while (fullStrIndex < fullLength && subStrIndex < subLength) {
            if (fullStr.charAt(fullStrIndex) == subStr.charAt(subStrIndex)) {
                ++subStrIndex;
                if (subStrIndex == subLength) {
                    return true;
                }
            }
            ++fullStrIndex;
        }
        return false;
    }
}
