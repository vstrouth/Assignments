package first.classes;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *  In this assignment we achieve a better understanding over IntelliJ IDE, Git mechanics and Maven Infrastructure
 *  by fully utilizing the aforementioned tools.
 *  This is a Maven Project on the IntelliJ platform, which then will be stored to a public
 *  repository at Github. This assignment contains:

 1) A class which is able to provide the mean, median, max and min value over an array of values. Also,
 this class provides the same statistical measurements for a array list of values (not the same as the array).
 2) A class that implements the Ascending Minima Algorithm.

 These classes should be clean, fully documented (Javadoc and overline comments) and fully tested,
 using the JUnit and Maven Surefire.

 */

public class App 
{
    /**
     * Array Case
     */
           public static void main( String[] args ) {
        // read from console numbers and insert them to an array
        int[] array = readArray.readNumsFromCommandLine();

        // make an object MetricsArray so that calculate min, max, mean and median of the array
        MetricsArray a = new MetricsArray();

        // call the method getMean from the class MetricsArray to calculate the mean and print it
        double mean_array = a.getMean(array);
        System.out.println("Your mean is: " + mean_array);


        // call the method getMedian from the class MetricsArray to calculate the median and print it
        double median_array = a.getMedian(array);
        System.out.println("Your median is: " + median_array);


        // call the method getMin from the class MetricsArray to calculate the min and print it
        double min_array = a.getMin(array);
        System.out.println("Your min is: " + min_array);


        // call the method getMax from the class MetricsArray to calculate the max and print it
        double max_array = a.getMax(array);
        System.out.println("Your max is: " + max_array);



        // read from the console the size of the window for the Ascending Minima Algorithm
        int k;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of the window for the Ascending Minima Algorithm");
        do {
            k = s.nextInt();
            if (k>array.length){
                System.out.println("You must enter size smaller than the array");
            }
        } while (k > array.length);


        /**
         * implement the Ascending Minima Algorithm on the array
         * with the method we've created to
         * the class AscendingMinimaAlgorithm
         */

        AscendingMinimaAlgorithm b = new AscendingMinimaAlgorithm();
        List <Integer> minima = new ArrayList<>();
        minima = b.make_shift(array, k);
        int [] index = b.minima_index(minima, array);

        // insert a specific moment <= array.size to find the minimum at this moment
        System.out.println("enter one moment to find the minimum at this");
        k = s.nextInt();
        int minimum = b.find_minimum(k, index, minima);
        System.out.println("The minimum at this moment is " + minimum);


    /**
     * Matrix case
     */
        // read from console the dimensions of the matrix and insert elements to it
        Scanner in = new Scanner(System.in);
        System.out.println("enter the dimensions of the Matrix");

        int row = in.nextInt();
        int col = in.nextInt();

        int[][] matrix = readMatrix.fill(row, col);


        // make an object MetricsMatrix so that calculate min, max, mean and median of the matrix
        MetricsMatrix m = new MetricsMatrix();


        // call the method getMean from the class MetricsMatrix to calculate the mean and print it
        double mean_matrix = m.getMean(matrix);
        System.out.println("Your mean is: " + mean_matrix);


        // call the method getMedian from the class MetricsMatrix to calculate the median and print it
        double median_matrix = m.getMedian(matrix);
        System.out.println("Your median is: " + median_matrix);


        // call the method getMin from the class MetricsMatrix to calculate the min and print it
        double min_matrix = m.getMin(matrix);
        System.out.println("Your min is: " + min_matrix);


        // call the method getMax from the class MetricsMatrix to calculate the max and print it
        double max_matrix = m.getMax(matrix);
        System.out.println("Your max is: " + max_matrix);


        // read from the console the size of the window for the Ascending Minima Algorithm
        System.out.println("enter the size of the window for the Ascending Minima Algorithm \n");
        k = s.nextInt();


        // convert the matrix into an array to implement the Ascending Minima Algorithm
        int newArray[] = new int[matrix.length * matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            int[] Row = matrix[i];
            for (int j = 0; j < Row.length; j++) {
                int number = matrix[i][j];
                newArray[i * Row.length + j] = number;
            }
        }


        /**
         * implement the Ascending Minima Algorithm on the array
         * with the method we've created to
         * the class AscendingMinimaAlgorithm
         */

        AscendingMinimaAlgorithm c = new AscendingMinimaAlgorithm();

        minima = c.make_shift(newArray, k);
        int [] index1 = b.minima_index(minima,newArray);

        // insert a specific moment <= array.size to find the minimum at this moment
        System.out.println("enter one moment to find the minimum at this");
        k = s.nextInt();
        int minimum1 = b.find_minimum(k, index1, minima);
        System.out.println("The minimum at this moment is " + minimum1);

    }
}



