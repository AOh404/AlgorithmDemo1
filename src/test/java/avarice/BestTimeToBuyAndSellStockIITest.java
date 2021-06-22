package avarice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BestTimeToBuyAndSellStockIITest {
    BestTimeToBuyAndSellStockII bestTimeToBuyAndSellStockII = new BestTimeToBuyAndSellStockII();

    @Test
    public void test_case1() {
        Assertions.assertEquals(7, bestTimeToBuyAndSellStockII.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    public void test_case2() {
        Assertions.assertEquals(4, bestTimeToBuyAndSellStockII.maxProfit(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void test_case3() {
        Assertions.assertEquals(0, bestTimeToBuyAndSellStockII.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
