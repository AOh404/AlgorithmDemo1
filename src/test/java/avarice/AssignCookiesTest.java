package avarice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssignCookiesTest {

    AssignCookies assignCookies = new AssignCookies();

    private void test_findContentChildren(int[] children, int[] cookies, int expected) {
        int childCount = assignCookies.findContentChildren(children, cookies);
        Assertions.assertEquals(expected, childCount);
    }

    @Test
    public void text_case1() {
        test_findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}, 1);
    }

    @Test
    public void test_case2() {
        test_findContentChildren(new int[]{1, 2}, new int[]{1, 2, 3}, 2);
    }
}
