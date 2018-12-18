import java.io.*;
import java.util.*;
/*  
Search a 2D Matrix

block.length // the number of rows
block[0].length // the number of columns on row 0
block[1].length // the number of columns on row 1

*/

  
public class Search2D {
    public boolean searchMatrix(int[][] matrix, int target) {
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
        return false;
    }
      System.out.pri
    int row = 0;
    int col = matrix[0].length - 1;
    while (row < matrix.length && col >= 0) {
        if (matrix[row][col] == target) {
            return true;
        } else if (matrix[row][col] < target) {
            row++;
        } else {
            col--;
        }
    }
    return false;
}

  public static void main(String[] args) {
        Search2D obj = new Search2D();
        int[][] nums={
                      {1,   3,  5,  7},
                      {10, 11, 16, 20},
                      {23, 30, 34, 50}
                     };
      System.out.println("Element found:"+obj.searchMatrix(nums,3));
        
  }
  
}
