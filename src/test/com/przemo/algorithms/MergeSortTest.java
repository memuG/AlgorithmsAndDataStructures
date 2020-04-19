package test.com.przemo.algorithms;

import com.przemo.algorithms.MergeSortShow;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MergeSortTest {

    private MergeSortShow target;

    @BeforeEach
    public void setUp() {
        target = new MergeSortShow();
    }

    @Test
    public void testMerge() {
        int[] expected = {1, 2, 3, 4};
        int[] input = {2, 1, 4, 3};
//        Assertions.assertArrayEquals(expected, target.merge(input, 0, 2, 3));
        Assertions.assertEquals("[1, 2]", Arrays.toString(target.merge(input, 0, 2, 3)));
    }
}
