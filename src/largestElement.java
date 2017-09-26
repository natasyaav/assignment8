import java.util.Scanner;
import java.util.Arrays;

/**
 * @author Natasya Virgichalia.
 * Date: 09/22/2017.
 * CSC 201-004N.
 * Professor Tanes Kanchanawanchai.
 * Assignment 8.13
 * This program prompts the user to enter a two dimensional array and displays the location of the largest element in the array.
 **/
public class largestElement {
    public static void main(String[] args){
        System.out.print("Enter the number of rows and columns of the array: ");
        Scanner keyboard = new Scanner(System.in);

        int rows = keyboard.nextInt();
        int columns = keyboard.nextInt();
        double [][] matrix = new double[rows][columns];

        System.out.println("Enter the array of " + rows + " rows and " + columns + " columns:");
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                matrix[r][c] = keyboard.nextDouble();
            }
        }
        String locate = locateLargest(matrix);
        System.out.print("The location of the largest element is at " + locate);

    }
    /**
     * This method returns the location of the largest element in a two dimensional array
     * @param a is a two dimensional array with numbers input from the user
     * @return the location of the largest element
     */
    public static String locateLargest(double[][]a) {
        double largest = a[0][0];
        int[] locate = new int[2];
        for (int n=0; n<a.length; n++) {
            for (int m=0; m<a[n].length; m++) {
                if(a[n][m] > largest) {
                    locate[0] = n;
                    locate[1] = m;
                    largest = a[n][m];
                }
            }
        }
        String printLocate = Arrays.toString(locate);
        return printLocate;
    }
}
