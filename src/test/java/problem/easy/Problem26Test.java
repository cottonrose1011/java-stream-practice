package problem.easy;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

public class Problem26Test {

    @Test
    public void testHasGreaterThanTen() {
        List<Integer> input = Arrays.asList(7, 8, 9, 10, 11);
        assertTrue(Problem26.hasGreaterThanTen(input));
        assertFalse(Problem26.hasGreaterThanTen(Arrays.asList(1, 2, 3, 4)));
    }
}
