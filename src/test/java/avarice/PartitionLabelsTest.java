package avarice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class PartitionLabelsTest {
    PartitionLabels partitionLabels = new PartitionLabels();

    @Test
    public void test_case1() {
        Assertions.assertIterableEquals(Arrays.asList(9, 7, 8), partitionLabels.partitionLabels("ababcbacadefegdehijhklij"));
    }

    @Test
    public void test_case2() {
        Assertions.assertIterableEquals(Arrays.asList(1, 7, 1, 1, 2), partitionLabels.partitionLabels("abcdbcdcqwpp"));
    }
}
