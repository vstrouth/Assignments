package first.classes;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

/**
 * This is a class that implements the ready functions min, max, mean and median
 * of the array and prints the results to the console.
 * */

public class MetricsArray {


            // this method converts the input numbers into DescriptiveStatistics object
            public static DescriptiveStatistics Convert(int [] numbers) {

                DescriptiveStatistics stats = new DescriptiveStatistics();

                // add every element of the array to the DescriptiveStatistics object
                for (int i = 0; i < numbers.length;  i++)
                    stats.addValue(numbers[i]);

                return stats;

            }

            /**
             * implement the ready methods
             */



            //method for mean
            public static double getMean (int [] numbers){

                // create DescriptiveStatistics object of the commons-math3 library
                // so that implement the ready methods
                DescriptiveStatistics stats = new DescriptiveStatistics();

                // convert array to DescriptiveStatistics object
                stats = Convert(numbers);

                double mean;
                return mean = stats.getMean();
            }



            //method for median
            public static double getMedian (int [] numbers){

                // create DescriptiveStatistics object of the commons-math3 library
                // so that implement the ready methods
                DescriptiveStatistics stats = new DescriptiveStatistics();

                // convert array to DescriptiveStatistics object
                stats = Convert(numbers);

                double median;
                return median = stats.getPercentile(50);
            }



            //function for max
            public static double getMax (int [] numbers){

                // create DescriptiveStatistics object of the commons-math3 library
                // so that implement the ready methods
                DescriptiveStatistics stats = new DescriptiveStatistics();

                // convert array to DescriptiveStatistics object
                stats = Convert(numbers);

                double max;
                return max = stats.getMax();
            }



            //method for min
            public static double getMin (int [] numbers){

                // create DescriptiveStatistics object of the commons-math3 library
                // so that implement the ready methods
                DescriptiveStatistics stats = new DescriptiveStatistics();

                // convert array to DescriptiveStatistics object
                stats = Convert(numbers);

                double min;
                return min = stats.getMin();
            }


}
