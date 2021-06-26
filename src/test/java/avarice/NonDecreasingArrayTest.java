package avarice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NonDecreasingArrayTest {
    NonDecreasingArray nonDecreasingArray = new NonDecreasingArray();

    @Test
    public void test_case1() {
        Assertions.assertTrue(nonDecreasingArray.checkPossibility(new int[]{4, 2, 3}));
    }

    @Test
    public void test_case2() {
        Assertions.assertFalse(nonDecreasingArray.checkPossibility(new int[]{4, 2, 1}));
    }

    @Test
    public void test_case3() {
        Assertions.assertFalse(nonDecreasingArray.checkPossibility(new int[]{3, 4, 2, 3}));
    }

    @Test
    public void test_case4() {
        Assertions.assertTrue(nonDecreasingArray.checkPossibility(new int[]{5, 7, 1, 8}));
    }
}
