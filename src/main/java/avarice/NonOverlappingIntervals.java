package avarice;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 435. 无重叠区间
 * 给定一个区间的集合，找到需要移除区间的最小数量，使剩余区间互不重叠。
 * <p>
 * 注意:
 * <p>
 * 可以认为区间的终点总是大于它的起点。
 * 区间 [1,2] 和 [2,3] 的边界相互“接触”，但没有相互重叠。
 * 示例 1:
 * <p>
 * 输入: [ [1,2], [2,3], [3,4], [1,3] ]
 * <p>
 * 输出: 1
 * <p>
 * 解释: 移除 [1,3] 后，剩下的区间没有重叠。
 * 示例 2:
 * <p>
 * 输入: [ [1,2], [1,2], [1,2] ]
 * <p>
 * 输出: 2
 * <p>
 * 解释: 你需要移除两个 [1,2] 来使剩下的区间没有重叠。
 * 示例 3:
 * <p>
 * 输入: [ [1,2], [2,3] ]
 * <p>
 * 输出: 0
 * <p>
 * 解释: 你不需要移除任何区间，因为它们已经是无重叠的了。
 */
public class NonOverlappingIntervals {

    /**
     * 思路：
     * 1. 将区间的终点进行排序;
     * 2. 挑选出结尾大小最小的进行保留，因为这样余留给其他区间的空间越大；
     *
     * @param intervals 区间集合
     * @return 需要移除区间的最小数量
     */
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[1]));

        int min = 0;
        int prev = intervals[0][1];
        for (int index = 1, size = intervals.length; index < size; index++) {
            if (intervals[index][0] < prev) {
                ++min;
            } else {
                prev = intervals[index][1];
            }
        }
        return min;
    }
}
