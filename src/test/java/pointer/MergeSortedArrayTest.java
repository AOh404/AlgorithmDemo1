package pointer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MergeSortedArrayTest {
    MergeSortedArray mergeSortedArray = new MergeSortedArray();

    // region 双指针

    @Test
    public void test_doublePointer_case1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        mergeSortedArray.mergeDoublePointer(nums1, 3, new int[]{2, 5, 6}, 3);
        Assertions.assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    public void test_doublePointer_case2() {
        int[] nums1 = {1};
        mergeSortedArray.mergeDoublePointer(nums1, 1, new int[]{}, 0);
        Assertions.assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    public void test_doublePointer_case3() {
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        mergeSortedArray.mergeDoublePointer(nums1, 3, new int[]{1, 2, 3}, 3);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, nums1);
    }

    // endregion

    // region 逆向双指针
    @Test
    public void test_reverseDoublePointer_case1() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        mergeSortedArray.mergeReverseDoublePointer(nums1, 3, new int[]{2, 5, 6}, 3);
        Assertions.assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    public void test_reverseDoublePointer_case2() {
        int[] nums1 = {1};
        mergeSortedArray.mergeReverseDoublePointer(nums1, 1, new int[]{}, 0);
        Assertions.assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    public void test_reverseDoublePointer_case3() {
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        mergeSortedArray.mergeReverseDoublePointer(nums1, 3, new int[]{1, 2, 3}, 3);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, nums1);
    }

    // endregion
}
