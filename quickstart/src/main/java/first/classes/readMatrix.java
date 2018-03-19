package first.classes;

import java.util.Scanner;


/**
 * class to read elements of a matrix
 */


public class readMatrix {


        // Function witch implements the reading of the matrix elements from the console.
        // The dimensions of the matrix are the input of the function

        public static int[][] fill(int row, int col) {


                int[][] data = new int[row][col];
                Scanner in = new Scanner(System.in);


                for(int i = 0; i< data.length; i++){

                        for(int j = 0 ;j< data[i].length; j++){

                            System.out.println("enter the " + i + "," + j + " element of the Matrix");
                            data[i][j] = in.nextInt();

                        }

                        System.out.println();

                }



                for(int i = 0; i< data.length; i++){


                        for(int j = 0 ;col< data[i].length; col++){
                            System.out.println(data[i][j]);
                        }
                        System.out.println();


                }


                return data;

        }



}
