package dataStructure;
import java.util.Scanner;
import java.util.Random;
/**
 * Created by soren on 8/6/2016.
 */
public class MultiDimensionArray {
    public static void main(String[] args) {
        System.out.println("Please enter numbers: ");
       Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int rows = 300;
        int column = 300;
        int [][] multiArray = new int[rows][column];
        for(int i=0; i<rows; i++){
            for (int j=0; j<column; j++){
                multiArray[i][j] = random.nextInt(100);
            }
        }
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < column; j++) {
                System.out.print(multiArray[i][j]);
                System.out.print(" ");

            }
            System.out.println();
        }
    }
}
