package first.classes;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

import java.util.Arrays;

/**
 * class which implements the basic metrics mean, max, min, median to the emelents of a matrix
 */
public class MetricsMatrix {




        // this method converts the input numbers into DescriptiveStatistics object
        public static DescriptiveStatistics Convert(int [][] numbers) {

            DescriptiveStatistics stats = new DescriptiveStatistics();

            // add every element of the array to the DescriptiveStatistics object
            for (int i = 0; i < numbers.length;  i++){
                for (int j = 0; j < numbers[i].length; j++){
                    stats.addValue(numbers[i][j]);
                }
            }

            return stats;

        }



        /**
        * implement the ready methods
        */


        //method for mean
        public static double getMean (int [][] numbers){

            // create DescriptiveStatistics object of the commons-math3 library
            // so that implement the ready methods
            DescriptiveStatistics stats = new DescriptiveStatistics();

            // convert array to DescriptiveStatistics object
            stats = Convert(numbers);

            double mean;
            return mean = stats.getMean();
        }




        //function for median
        public static double getMedian (int [][] numbers){

            // create DescriptiveStatistics object of the commons-math3 library
            // so that implement the ready methods
            DescriptiveStatistics stats = new DescriptiveStatistics();

            // convert array to DescriptiveStatistics object
            stats = Convert(numbers);

            double median;
            return median = stats.getPercentile(50);
        }




        //function for max
        public static double getMax (int [][] numbers){

            // create DescriptiveStatistics object of the commons-math3 library
            // so that implement the ready methods
            DescriptiveStatistics stats = new DescriptiveStatistics();

            // convert array to DescriptiveStatistics object
            stats = Convert(numbers);

            double max;
            return max = stats.getMax();
        }




        //function for min
        public static double getMin (int [][] numbers){

            // create DescriptiveStatistics object of the commons-math3 library
            // so that implement the ready methods
            DescriptiveStatistics stats = new DescriptiveStatistics();

            // convert array to DescriptiveStatistics object
            stats = Convert(numbers);

            double min;
            return min = stats.getMin();
        }



}
