package first.classes;

import java.util.Arrays;
import java.util.Scanner;


/**
 * class to read a specific number of numbers
 */

public class readArray{

        public static int[] readNumsFromCommandLine() {

            Scanner s = new Scanner(System.in);

            System.out.println("Give the dimension of the array \n");
            int count = s.nextInt();
            //s.nextLine(); // throw away the newline.

            int[] numbers = new int[count];
            Scanner numScanner = new Scanner(System.in);


                for (int i = 0; i < count; i++) {

                    System.out.println("Give the number " + (i+1) + " of the array \n");

                        if (numScanner.hasNextInt()) {

                            numbers[i] = numScanner.nextInt();

                        } else {

                            System.out.println("You didn't provide enough numbers");
                            break;

                        }

                }


            System.out.println(Arrays.toString(numbers));
            return numbers;

        }

}
