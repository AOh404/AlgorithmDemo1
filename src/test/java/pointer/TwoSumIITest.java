package pointer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumIITest {
    TwoSumII twoSumII = new TwoSumII();

    @Test
    public void test_case1() {
        int[] actual = twoSumII.twoSum(new int[]{2, 7, 11, 15}, 9);
        Assertions.assertArrayEquals(new int[]{1, 2}, actual);
    }

    @Test
    public void test_case2() {
        int[] actual = twoSumII.twoSum(new int[]{2, 3, 4}, 6);
        Assertions.assertArrayEquals(new int[]{1, 3}, actual);
    }

    @Test
    public void test_case3() {
        int[] actual = twoSumII.twoSum(new int[]{-1, 0}, -1);
        Assertions.assertArrayEquals(new int[]{1, 2}, actual);
    }
}
