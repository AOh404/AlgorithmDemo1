package avarice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinNumOfArrowsToBurstBalloonsTest {
    MinNumOfArrowsToBurstBalloons minNumOfArrowsToBurstBalloons = new MinNumOfArrowsToBurstBalloons();

    @Test
    public void test_case1() {
        int[][] points = new int[][]{
                {10, 16},
                {2, 8},
                {1, 6},
                {7, 12}
        };
        Assertions.assertEquals(2, minNumOfArrowsToBurstBalloons.findMinArrowShots(points));
    }

    @Test
    public void test_case2() {
        int[][] points = new int[][]{
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8}
        };
        Assertions.assertEquals(4, minNumOfArrowsToBurstBalloons.findMinArrowShots(points));
    }

    @Test
    public void test_case3() {
        int[][] points = new int[][]{
                {1, 2},
                {2, 3},
                {3, 4},
                {4, 5}
        };
        Assertions.assertEquals(2, minNumOfArrowsToBurstBalloons.findMinArrowShots(points));
    }

    @Test
    public void test_case4() {
        int[][] points = new int[][]{
                {1, 2},
        };
        Assertions.assertEquals(1, minNumOfArrowsToBurstBalloons.findMinArrowShots(points));
    }

    @Test
    public void test_case5() {
        int[][] points = new int[][]{
                {2, 3},
                {2, 3}
        };
        Assertions.assertEquals(1, minNumOfArrowsToBurstBalloons.findMinArrowShots(points));
    }

    @Test
    public void test_case6() {
        int[][] points = new int[][]{
                {3, 9},
                {7, 12},
                {3, 8},
                {6, 8},
                {9, 10},
                {2, 9},
                {0, 9},
                {3, 9},
                {0, 6},
                {2, 8}
        };
        Assertions.assertEquals(2, minNumOfArrowsToBurstBalloons.findMinArrowShots(points));
    }
}
