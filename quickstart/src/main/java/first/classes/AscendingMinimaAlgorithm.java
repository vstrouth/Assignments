package first.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * class which implements the Ascending minima algorithm to
 * find the minimun of a shifting window in an array.
 * It's important to check special cases like empty array {}
 * or array with only one element, or array with duplicates to take the last one
 */

public class AscendingMinimaAlgorithm {


    /**
     * method which makes the shift of the window and calculate the new minima arraylist
     */
    public static List<Integer> get_minima_adjusted_to_shift (List<Integer> previous_window,int new_element,List<Integer> previous_minima){


            // case that we delete the first minima array element if it's equal to the first window element
            if (previous_window.get(0) == previous_minima.get(0)){
                previous_minima.remove(0);

            }

            int size = previous_minima.size();
            // delete all the values of the minima arraylist (beginning from the arraylist end)
            // which are >new element
            for (int i = size-1; i >= 0; i--){

                if (previous_minima.get(i) >= new_element) {

                    previous_minima.remove(i);


                }else{

                    break;

                }

            }


            // add the new element to the minima arraylist
            previous_minima.add(new_element);


            // return the new minima arraylist
            return previous_minima;

    }


    /**
     * method to take the index of the min element
     */
    public static int getMinIndex(List<Integer> inputArray){

            int minIndex = 0;
            int minValue = inputArray.get(0);


            for(int i=1; i < inputArray.size(); i++){

                // the condition is an <= inequality because we want to consider the case of duplicates
                if(inputArray.get(i) <= minValue){

                    minValue = inputArray.get(i);
                    minIndex = i;
                }
            }


            return minIndex;
    }



    /**
     * with this method we implement the Ascending Minima Algorithm to the first
     * k elements of the array(initial position of the window)
     */
    public static List<Integer> ascending_minima(List<Integer> array){


            List<Integer> minima = new ArrayList<>();
            int minIndex;


            // case that the sub-window is an empty arraylist
            if (array.size() == 0) {
                System.out.println("Array is empty \n");
                return minima;
            }


            // case that the sub-window has only one element
            if (array.size() == 1) {
                minima.add(array.get(0));
                return minima;
            }

            // take the index of the minimum element of the first window
            minIndex = getMinIndex(array);

            // add the minimum element to the minima arraylist
            minima.add(array.get(minIndex));

            /**
             * *find the minimum of the next sub-window
             * (i.e. [the index of the minimum element of the window+1] to k-1 element
             * and we take k-1 element because the index is zero based)
             */
            array = array.subList(minIndex+1, array.size());


            // recursive call for the frame and the recursion will stop when the sub-window is an empty array
            minima.addAll(ascending_minima(array));


            //return the minima of the entire first window
            return minima;
    }



    /**
     * In this method we shift the window and implement
     * Ascending Minima Algorithm according to the sliding window
     */
    public static List<Integer> make_shift (int [] array, int slid_window_size){


        if (array.length == 0){
            return null;
        }

            int k = slid_window_size;

            // take one part of the array as a window
            List <Integer> window = new ArrayList<>();

            // the minima arraylist
            List <Integer> minima = new ArrayList<>();

            // convert the array to arraylist
            for (int i = 0; i< k; i++){

                window.add(array[i]);
            }


            // use this method to calculate the minima of the initial position of the window
            minima = ascending_minima(window);



            /** implement
              * Ascending Minima Algorithm according to the sliding window
             */
            int j = 0;


            // implement until the last element of the window is the last element of the array
            while (k < array.length){
                // return the new minima array after the shift of the window by an element
                minima = get_minima_adjusted_to_shift(window, array[k],minima);
                window.add(array[k]);
                window.remove(j);
                k++;
                j++;
            }

            System.out.println(minima);


            return minima;

    }

    /**
     * This method is used to find the index of every element of the minima arraylist
     * so that we could find the minimum every moment
     */

    public static int [] minima_index (List <Integer> minima, int [] array){


        // case of empty array
        if (minima == null){
            System.out.println("The array is empty");
            return null;
        }

        int size = minima.size();
        int [] index = new int[size];

        // we note that we take the index of the last one in case of duplicates
        for (int i = 0; i < minima.size(); i++){

            for (int j = 0; j < array.length; j++){

                if (minima.get(i) == array[j]){
                    index[i] = j;
                }
            }
        }
        System.out.println(Arrays.toString(index));
        return index;
    }

    /**
     * method to find the minimum at a specific moment
     */
    public static int find_minimum (int moment,int[] index, List <Integer> minima){

        int minimum =0;

        if (minima==null){
            return 0;
        }

        // search in which indexes of minima elements, the given moment is
        for(int i = 0; i < index.length; i++){

            if (moment >= index[i]){

                minimum = i;
            }
        }

        return minima.get(minimum);
    }

}
