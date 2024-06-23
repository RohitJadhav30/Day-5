package FunctionalPrograms;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();
        

        Object arr[][] = new Object[row][cols];

        System.out.println("Enter the array elements: ");
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < cols; j++){
                if(sc.hasNextInt()){
                    arr[i][j] = sc.nextInt();
                }
                else if(sc.hasNextDouble()){
                    arr[i][j] = sc.nextDouble();
                }
                else if(sc.hasNextBoolean()){
                    arr[i][j] = sc.nextBoolean();
                }
                
            }
           
        }
        sc.close();

        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        System.out.println("The array elements are: ");
        
        for (Object[] rows : arr) {
            for (Object elements : rows) {
                pw.print(elements + " ");
            }
            pw.println();    
        }
        pw.flush();
    }
}
