package avarice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CanPlaceFlowersTest {
    CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();

    @Test
    public void test_case1() {
        int[] flowerbed = new int[]{1, 0, 0, 0, 1};
        Assertions.assertTrue(canPlaceFlowers.canPlaceFlowers(flowerbed, 1));
    }

    @Test
    public void test_case2() {
        int[] flowerbed = new int[]{1, 0, 0, 0, 1};
        Assertions.assertFalse(canPlaceFlowers.canPlaceFlowers(flowerbed, 2));
    }

    @Test
    public void test_case3() {
        int[] flowerbed = new int[]{0, 0, 0, 0};
        Assertions.assertTrue(canPlaceFlowers.canPlaceFlowers(flowerbed, 2));
    }

    @Test
    public void test_case4() {
        int[] flowerbed = new int[]{0, 0, 0, 0, 0};
        Assertions.assertTrue(canPlaceFlowers.canPlaceFlowers(flowerbed, 3));
    }

    @Test
    public void test_case5() {
        int[] flowerbed = new int[]{1, 0, 0, 1};
        Assertions.assertFalse(canPlaceFlowers.canPlaceFlowers(flowerbed, 1));
    }

    @Test
    public void test_case6() {
        int[] flowerbed = new int[]{1, 0, 1, 0};
        Assertions.assertFalse(canPlaceFlowers.canPlaceFlowers(flowerbed, 1));
    }

    @Test
    public void test_case7() {
        int[] flowerbed = new int[]{1, 0, 0, 0, 0, 0, 1};
        Assertions.assertTrue(canPlaceFlowers.canPlaceFlowers(flowerbed, 2));
    }

    @Test
    public void test_case8() {
        int[] flowerbed = new int[]{1, 0, 1, 0, 1, 0, 1};
        Assertions.assertFalse(canPlaceFlowers.canPlaceFlowers(flowerbed, 1));
    }

    @Test
    public void test_case9() {
        int[] flowerbed = new int[]{0, 0, 1, 0, 1};
        Assertions.assertTrue(canPlaceFlowers.canPlaceFlowers(flowerbed, 1));
    }

    @Test
    public void test_case10() {
        int[] flowerbed = new int[]{1, 0, 0, 0, 1, 0, 0};
        Assertions.assertTrue(canPlaceFlowers.canPlaceFlowers(flowerbed, 2));
    }
}
