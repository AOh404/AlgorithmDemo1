package hashtable;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TwoSumTest {

    TwoSum twoSum = new TwoSum();

    @Test
    public void test_case1() {
        int[] actual = twoSum.twoSum(new int[]{2, 7, 11, 15}, 9);
        Assertions.assertArrayEquals(new int[]{0, 1}, actual);
    }

    @Test
    public void test_case2() {
        int[] actual = twoSum.twoSum(new int[]{3, 2, 4}, 6);
        Assertions.assertArrayEquals(new int[]{1, 2}, actual);
    }

    @Test
    public void test_case3() {
        int[] actual = twoSum.twoSum(new int[]{3, 3}, 6);
        Assertions.assertArrayEquals(new int[]{0, 1}, actual);
    }
}