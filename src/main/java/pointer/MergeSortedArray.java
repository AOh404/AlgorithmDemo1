package pointer;

/**
 * 88. 合并两个有序数组
 * 给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。你可以假设 nums1 的空间大小等于 m + n，这样它就有足够的空间保存来自 nums2 的元素。
 * <p>
 * 示例 1：
 * 输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * 输出：[1,2,2,3,5,6]
 * <p>
 * 示例 2：
 * 输入：nums1 = [1], m = 1, nums2 = [], n = 0
 * 输出：[1]
 * <p>
 * 提示：
 * nums1.length == m + n
 * nums2.length == n
 * 0 <= m, n <= 200
 * 1 <= m + n <= 200
 * -10^9 <= nums1[i], nums2[i] <= 10^9
 */
public class MergeSortedArray {

    // 双指针法
    public void mergeDoublePointer(int[] nums1, int m, int[] nums2, int n) {
        int index1 = 0;
        int index2 = 0;
        int[] sorted = new int[m + n];
        int current;
        while (index1 < m || index2 < n) {
            if (index1 == m) {
                current = nums2[index2++];
            } else if (index2 == n) {
                current = nums1[index1++];
            } else if (nums1[index1] < nums2[index2]) {
                current = nums1[index1++];
            } else {
                current = nums2[index2++];
            }
            sorted[index1 + index2 - 1] = current;
        }
        System.arraycopy(sorted, 0, nums1, 0, m + n);
    }

    // 逆向双指针法
    public void mergeReverseDoublePointer(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m - 1;
        int index2 = n - 1;
        int tailIndex = m + n - 1;
        int current;
        while (index1 >= 0 || index2 >= 0) {
            if (index1 < 0) {
                current = nums2[index2--];
            } else if (index2 < 0) {
                current = nums1[index1--];
            } else if (nums1[index1] < nums2[index2]) {
                current = nums2[index2--];
            } else {
                current = nums1[index1--];
            }
            nums1[tailIndex--] = current;
        }
    }
}
