package pointer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class LongestWordInDictionaryThroughDeletingTest {
    LongestWordInDictionaryThroughDeleting longestWordInDictionaryThroughDeleting = new LongestWordInDictionaryThroughDeleting();

    // region 排序并检查子序列

    @Test
    public void test_sortCheckSubStr_case1() {
        String actual = longestWordInDictionaryThroughDeleting.findLongestWordSortCheckSubStr("abpcplea", Arrays.asList("ale", "apple", "monkey", "plea"));
        Assertions.assertEquals("apple", actual);
    }

    @Test
    public void test_sortCheckSubStr_case2() {
        String actual = longestWordInDictionaryThroughDeleting.findLongestWordSortCheckSubStr("abpcplea", Arrays.asList("ale", "aplea", "apple", "plea"));
        Assertions.assertEquals("aplea", actual);
    }

    @Test
    public void test_sortCheckSubStr_case3() {
        String actual = longestWordInDictionaryThroughDeleting.findLongestWordSortCheckSubStr("abpcplea", Arrays.asList("ale", "apple", "aplea", "plea"));
        Assertions.assertEquals("aplea", actual);
    }

    @Test
    public void test_sortCheckSubStr_case4() {
        String actual = longestWordInDictionaryThroughDeleting.findLongestWordSortCheckSubStr("abpcplea", Arrays.asList("a", "b", "c"));
        Assertions.assertEquals("a", actual);
    }

    @Test
    public void test_sortCheckSubStr_case5() {
        String actual = longestWordInDictionaryThroughDeleting.findLongestWordSortCheckSubStr("abce", Arrays.asList("abe", "abc"));
        Assertions.assertEquals("abc", actual);
    }

    // endregion

    // region 不需要排序

    @Test
    public void test_withoutSort_case1() {
        String actual = longestWordInDictionaryThroughDeleting.findLongestWordWithoutSort("abpcplea", Arrays.asList("ale", "apple", "monkey", "plea"));
        Assertions.assertEquals("apple", actual);
    }

    @Test
    public void test_withoutSort_case2() {
        String actual = longestWordInDictionaryThroughDeleting.findLongestWordWithoutSort("abpcplea", Arrays.asList("ale", "aplea", "apple", "plea"));
        Assertions.assertEquals("aplea", actual);
    }

    @Test
    public void test_withoutSort_case3() {
        String actual = longestWordInDictionaryThroughDeleting.findLongestWordWithoutSort("abpcplea", Arrays.asList("ale", "apple", "aplea", "plea"));
        Assertions.assertEquals("aplea", actual);
    }

    @Test
    public void test_withoutSort_case4() {
        String actual = longestWordInDictionaryThroughDeleting.findLongestWordWithoutSort("abpcplea", Arrays.asList("a", "b", "c"));
        Assertions.assertEquals("a", actual);
    }

    @Test
    public void test_withoutSort_case5() {
        String actual = longestWordInDictionaryThroughDeleting.findLongestWordWithoutSort("abce", Arrays.asList("abe", "abc"));
        Assertions.assertEquals("abc", actual);
    }

    // endregion
}
