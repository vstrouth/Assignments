package first.classes;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * class which implements the basic metrics mean, max, min, median
 * to a matrix
 */
public class MetricsMatrixTest {

    int [][] temp = new int[2][5];
    MetricsMatrix mm = new MetricsMatrix();


    /**
     * This method is setting up the test environment by filling a matrix with
     * values that will be used in the tests for metrics.
     */
    @Before
    public void setUp() {


        temp[0][0] = 1;
        temp[0][1] = 3;
        temp[0][2] = 3;
        temp[0][3] = 2;
        temp[0][4] = 5;
        temp[1][0] = 8;
        temp[1][1] = 7;
        temp[1][2] = 8;
        temp[1][3] = 9;
        temp[1][4] = 6;
    }


    /**
     * This method checks if the methods of class MetricsArray calculate the correct results
     */

    @Test
    public void CheckMetrics() {


        assertEquals(mm.getMean(temp), 5.2);
        assertEquals(mm.getMedian(temp), 5.5);
        assertEquals(mm.getMin(temp), 1.0);
        assertEquals(mm.getMax(temp), 9.0);

    }
}
