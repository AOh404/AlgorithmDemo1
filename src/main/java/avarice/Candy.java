package avarice;

import java.util.Arrays;

/**
 * 135. 分发糖果
 * 老师想给孩子们分发糖果，有 N 个孩子站成了一条直线，老师会根据每个孩子的表现，预先给他们评分。
 * <p>
 * 你需要按照以下要求，帮助老师给这些孩子分发糖果：
 * 每个孩子至少分配到 1 个糖果。
 * 评分更高的孩子必须比他两侧的邻位孩子获得更多的糖果。
 * 那么这样下来，老师至少需要准备多少颗糖果呢？
 * <p>
 * 示例1：
 * <p>
 * 输入：[1,0,2]
 * 输出：5
 * 解释：你可以分别给这三个孩子分发 2、1、2 颗糖果。
 * <p>
 * 示例2：
 * <p>
 * 输入：[1,2,2]
 * 输出：4
 * 解释：你可以分别给这三个孩子分发 1、2、1 颗糖果。
 * 第三个孩子只得到 1 颗糖果，这已满足上述两个条件。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/candy
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Candy {

    /**
     * 思路：
     * 1. 把所有孩子的糖果数初始化为 1;
     * 2. 先从左往右遍历，如果右边孩子的评分比左边的高，则将右边孩子的糖果数更新为左边孩子的糖果数+1;
     * 3. 从右往左遍历，如果左边孩子的评分比右边的高，且左边孩子当前的糖果数 不大于右边孩子的糖果数，则左边孩子的糖果数更新为右边孩子的糖果数+1。
     *
     * @param ratings 孩子的评分
     * @return 最少的糖果的数量
     */
    public int findMinCandyCount(int[] ratings) {
        int childCount = ratings.length;

        int[] candy = new int[childCount];
        Arrays.fill(candy, 1);

        for (int index = 1; index < childCount; index++) {
            if (ratings[index - 1] < ratings[index]) {
                candy[index] = candy[index - 1] + 1;
            }
        }

        int minCount = 0;
        for (int index = childCount - 1; index > 0; index--) {
            if (ratings[index - 1] > ratings[index]) {
                candy[index - 1] = Math.max(candy[index - 1], candy[index] + 1);
            }
            minCount += candy[index];
        }
        minCount += candy[0];

        return minCount;
    }
}
