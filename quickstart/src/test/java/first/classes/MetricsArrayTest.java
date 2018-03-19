package first.classes;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * class which implements the basic metrics mean, max, min, median
 * to the emelents of an array
 */

public class MetricsArrayTest {

    int [] temp = new int[10];
    MetricsArray ma = new MetricsArray();

    /**
     * This method is setting up the test environment by filling an array with
     * values that will be used in the tests for metrics.
     */
    @Before
    public void setUp() {


        temp[0] = 1;
        temp[1] = 3;
        temp[2] = 3;
        temp[3] = 2;
        temp[4] = 5;
        temp[5] = 8;
        temp[6] = 7;
        temp[7] = 8;
        temp[8] = 9;
        temp[9] = 6;

    }

    /**
     * This method checks if the methods of class MetricsArray calculate the correct results
     */

    @Test
    public void CheckMetrics() {


        assertEquals(ma.getMean(temp), 5.2);
        assertEquals(ma.getMedian(temp), 5.5);
        assertEquals(ma.getMin(temp), 1.0);
        assertEquals(ma.getMax(temp), 9.0);

    }

}
