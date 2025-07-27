import  java.util.*;
public class TwoDarray {
    public static void main(String args[]) {
        
        // Scanner sc = new Scanner(System.in);
        // int row = sc.nextInt();
        // int col = sc.nextInt();

        // int[][] numbers = new int[row][col];

        // for(int i=0; i<row; i++){
        //     for(int j=0; j<col; j++){
        //         numbers[i][j] = sc.nextInt();
        //     }

        // }

        // for(int i=0; i<row; i++){
        //     for(int j=0; j<col; j++){
        //         System.out.print(numbers[i][j] + " ");
        //     }
        //     System.out.println();

        // }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int row = sc.nextInt();
        System.out.println("Enter no. of cols: ");
        int cols = sc.nextInt();

        int[][] matrixSearch = new int[row][cols];

        System.out.println("Enter the matrix: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<cols; j++){
                matrixSearch[i][j] = sc.nextInt();

            }
        }
        System.out.println("Enter the number forSearc: ");
        int traget = sc.nextInt();

        
        for(int i=0; i<row; i++){
            for(int j=0; j<cols; j++){
            
                if(matrixSearch[i][j] == traget){
                    System.out.print("the search location is : " + i + ", " + j);
                }
            }
        }
    }
}

