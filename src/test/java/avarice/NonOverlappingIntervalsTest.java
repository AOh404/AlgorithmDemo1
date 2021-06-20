package avarice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NonOverlappingIntervalsTest {
    NonOverlappingIntervals nonOverlappingIntervals = new NonOverlappingIntervals();

    @Test
    public void text_case1() {
        int[][] intervals = {
                {1, 2},
                {2, 3},
                {3, 4},
                {1, 3}
        };
        Assertions.assertEquals(1, nonOverlappingIntervals.eraseOverlapIntervals(intervals));
    }

    @Test
    public void test_case2() {
        int[][] intervals = {
                {1, 2},
                {1, 2},
                {1, 2}
        };
        Assertions.assertEquals(2, nonOverlappingIntervals.eraseOverlapIntervals(intervals));
    }

    @Test
    public void test_case3() {
        int[][] intervals = {
                {1, 2},
                {2, 3}
        };
        Assertions.assertEquals(0, nonOverlappingIntervals.eraseOverlapIntervals(intervals));
    }
}
