import java.util.*;
// A Java program that takes unsloved sudoku as input and prints out solved sudoku out to the console..
public class Sudoku_solver {
    public static boolean solveSudoku(int[][] board) {
        for (int i = 0; i < 9; i++) {
          for (int j = 0; j < 9; j++) {
            //Is the cell empty??
            if (board[i][j] == 0) {
    
              for (int c = 1; c <= 9; c++) {
                //Is it valid to place current c value in that grid ??
                if (isValidToplace(board, i, j, c)) {
                  board[i][j] = c;
    
                  if (solveSudoku(board))
                    return true;
                  else
                    board[i][j] = 0;
                }
              }
              return false;
            }
          }
        }
        return true;
    }
    public static boolean isValidToplace(int[][] board, int row, int col, int c) {
        for (int i = 0; i < 9; i++) {
          //checking in the coloumn  
          if (board[i][col] == c)
            return false;
          //checking in the row
          if (board[row][i] == c)
            return false;
          //checking in the sub-matrix
          if (board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c)
            return false;
        }
        return true;
    }
    public static void printSolvedSudoku(int[][] board){
        System.out.println("The solved sudoku puzzle is...");
        for(int i= 0; i< 9; i++){
            for(int j= 0; j< 9; j++){
                System.out.print(board[i][j]);
                if(j%3==2)System.out.print("|");
                else System.out.print(" ");
            }
                System.out.println();
                if(i%3==2)System.out.println("- - -|- - -|- - -");
        }
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);  
        System.out.println("\nWelcome to Sudoku Solver!!!\n");
        System.out.println("Before we start, you will have to input the sudoku into this program...\n");  
        System.out.println("NOTE:\n 1.All numbers should be in the range of 1 to 9.");
        System.out.println(" 2.Empty cells sholud be entered as 0's..\n");
        System.out.println("Now enter your unsolved sudoku puzzle...\n");
        int[][] sudoku_board= new int[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                sudoku_board[i][j]=scanner.nextInt();
            }
        }
       // A method that solves sudoku 
       solveSudoku(sudoku_board);
       printSolvedSudoku(sudoku_board);
       scanner.close();
    }
    
}
