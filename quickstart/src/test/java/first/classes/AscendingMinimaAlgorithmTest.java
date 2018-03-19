package first.classes;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


/**
 * This is a component test set for the Ascending Minima Algorithm class
 * which is an integration test because resembles an expected user
 * interaction with the application.
 */


public class AscendingMinimaAlgorithmTest {


    //Initializing variables for the test
    int[] temp = new int[10];//noraml case
    int[] temp1 = new int[1];// case of one element array
    int [] temp2 = new int[0];// case of empty array
    AscendingMinimaAlgorithm ama;
    int window_size;
    List<Integer> minima = new ArrayList();
    int moment;


    /**
     * This method is setting up the test environment by filling an array list with
     * values that will be used in the tests. Also, it' setting up one moment.
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

        temp1[0] = 0;

        window_size = 9;

        AscendingMinimaAlgorithm ama = new AscendingMinimaAlgorithm();
        List<Integer> minima = new ArrayList();
        int[] index;
        moment = 7;



    }

    /**
     * This method checks if the minimum according to Ascending Minima Algorithm
     * is correct for one given moment
     */

    @Test
    public void FindMinimumWithAscendingMinima1() {

        minima = ama.make_shift(temp, window_size);
        int[] index = ama.minima_index(minima, temp);
        int minimum = ama.find_minimum(moment, index, minima);
        assertEquals(minimum, 5);
    }

    /**
     * This method checks if the Ascending Minima Algorithm
     * is implemented correctly in case of one element array
     */
    @Test
    public void FindMinimumWithAscendingMinima2() {

        minima = ama.make_shift(temp1, 1);
        int[] index = ama.minima_index(minima, temp1);
        int minimum = ama.find_minimum(0, index, minima);
        assertEquals(minimum, 0);
    }

    /**
     * This method checks if the Ascending Minima Algorithm
     * is implemented correctly in case of an empty array
     */
    @Test
    public void FindMinimumWithAscendingMinima3() {

        minima = ama.make_shift(temp2, 1);
        int[] index = ama.minima_index(minima, temp2);
        int minimum = ama.find_minimum(0, index, minima);
        assertEquals(minimum, 0);
    }


}