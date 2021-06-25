package avarice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QueueReconstructionByHeightTest {
    QueueReconstructionByHeight queueReconstructionByHeight = new QueueReconstructionByHeight();

    @Test
    public void taller_first_test_case1() {
        int[][] people = new int[][]{
                {7, 0},
                {4, 4},
                {7, 1},
                {5, 0},
                {6, 1},
                {5, 2},
        };
        int[][] expected = new int[][]{
                {5, 0},
                {7, 0},
                {5, 2},
                {6, 1},
                {4, 4},
                {7, 1},
        };
        Assertions.assertArrayEquals(expected, queueReconstructionByHeight.reconstructQueueTallerFirst(people));
    }

    @Test
    public void taller_first_test_case2() {
        int[][] people = new int[][]{
                {6, 0},
                {5, 0},
                {4, 0},
                {3, 2},
                {2, 2},
                {1, 4},
        };
        int[][] expected = new int[][]{
                {4, 0},
                {5, 0},
                {2, 2},
                {3, 2},
                {1, 4},
                {6, 0},
        };
        Assertions.assertArrayEquals(expected, queueReconstructionByHeight.reconstructQueueTallerFirst(people));
    }

    @Test
    public void shorter_first_test_case1() {
        int[][] people = new int[][]{
                {7, 0},
                {4, 4},
                {7, 1},
                {5, 0},
                {6, 1},
                {5, 2},
        };
        int[][] expected = new int[][]{
                {5, 0},
                {7, 0},
                {5, 2},
                {6, 1},
                {4, 4},
                {7, 1},
        };
        Assertions.assertArrayEquals(expected, queueReconstructionByHeight.reconstructQueueShorterFirst(people));
    }

    @Test
    public void shorter_first_test_case2() {
        int[][] people = new int[][]{
                {6, 0},
                {5, 0},
                {4, 0},
                {3, 2},
                {2, 2},
                {1, 4},
        };
        int[][] expected = new int[][]{
                {4, 0},
                {5, 0},
                {2, 2},
                {3, 2},
                {1, 4},
                {6, 0},
        };
        Assertions.assertArrayEquals(expected, queueReconstructionByHeight.reconstructQueueShorterFirst(people));
    }
}
