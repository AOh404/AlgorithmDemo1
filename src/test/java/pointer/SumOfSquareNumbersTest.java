package pointer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumOfSquareNumbersTest {
    SumOfSquareNumbers sumOfSquareNumbers = new SumOfSquareNumbers();

    // region 使用 sqrt 函数

    @Test
    public void test_sqrt_case1() {
        Assertions.assertTrue(sumOfSquareNumbers.judgeSquareSumSqrt(5));
    }

    @Test
    public void test_sqrt_case2() {
        Assertions.assertFalse(sumOfSquareNumbers.judgeSquareSumSqrt(3));
    }

    @Test
    public void test_sqrt_case3() {
        Assertions.assertTrue(sumOfSquareNumbers.judgeSquareSumSqrt(4));
    }

    @Test
    public void test_sqrt_case4() {
        Assertions.assertTrue(sumOfSquareNumbers.judgeSquareSumSqrt(2));
    }

    @Test
    public void test_sqrt_case5() {
        Assertions.assertTrue(sumOfSquareNumbers.judgeSquareSumSqrt(1));
    }

    @Test
    public void test_sqrt_case6() {
        Assertions.assertTrue(sumOfSquareNumbers.judgeSquareSumSqrt(0));
    }

    // endregion

    // region 双指针

    @Test
    public void test_pointer_case1() {
        Assertions.assertTrue(sumOfSquareNumbers.judgeSquareSumPointer(5));
    }

    @Test
    public void test_pointer_case2() {
        Assertions.assertFalse(sumOfSquareNumbers.judgeSquareSumPointer(3));
    }

    @Test
    public void test_pointer_case3() {
        Assertions.assertTrue(sumOfSquareNumbers.judgeSquareSumPointer(4));
    }

    @Test
    public void test_pointer_case4() {
        Assertions.assertTrue(sumOfSquareNumbers.judgeSquareSumPointer(2));
    }

    @Test
    public void test_pointer_case5() {
        Assertions.assertTrue(sumOfSquareNumbers.judgeSquareSumPointer(1));
    }

    @Test
    public void test_pointer_case6() {
        Assertions.assertTrue(sumOfSquareNumbers.judgeSquareSumPointer(0));
    }

    // endregion
}
