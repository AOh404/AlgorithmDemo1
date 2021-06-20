package avarice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CandyTest {

    Candy candy = new Candy();

    @Test
    public void text_case1() {
        Assertions.assertEquals(5, candy.findMinCandyCount(new int[]{1, 0, 2}));
    }

    @Test
    public void test_case2() {
        Assertions.assertEquals(4, candy.findMinCandyCount(new int[]{1, 2, 2}));
    }

    @Test
    public void test_case3() {
        Assertions.assertEquals(3, candy.findMinCandyCount(new int[]{1, 2}));
    }

    @Test
    public void test_case4() {
        Assertions.assertEquals(1, candy.findMinCandyCount(new int[]{2}));
    }
}