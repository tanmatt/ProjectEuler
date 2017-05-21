package java8;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * Created by Tanmay on 5/20/2017.
 * Test class
 */
public class PE1_Test {

    private final int THRESHOLD = 10;
    private final long RESULT = 23;

    private final int THRESHOLD_SMALL = 2;
    private final long RESULT_SMALL = 0;

    private PE1 pe1 = new PE1();

    @Test
    public void getSum_happyPath () {
        long result = PE1.getSum(THRESHOLD);
        assertTrue(result == RESULT);
    }

    @Test
    public void getSum_bypass () {
        long result = PE1.getSum(THRESHOLD_SMALL);
        assertTrue(result == RESULT_SMALL);
    }

}
