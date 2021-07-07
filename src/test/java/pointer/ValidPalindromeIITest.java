package pointer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidPalindromeIITest {
    ValidPalindromeII validPalindromeII = new ValidPalindromeII();

    @Test
    public void test_case1() {
        Assertions.assertTrue(validPalindromeII.validPalindrome("aba"));
    }

    @Test
    public void test_case2() {
        Assertions.assertTrue(validPalindromeII.validPalindrome("abca"));
    }

    @Test
    public void test_case3() {
        Assertions.assertTrue(validPalindromeII.validPalindrome("abbda"));
    }

    @Test
    public void test_case4() {
        Assertions.assertFalse(validPalindromeII.validPalindrome("abc"));
    }

    @Test
    public void test_case5() {
        Assertions.assertTrue(validPalindromeII.validPalindrome("ebcbbececabbacecbbcbe"));
    }
}
