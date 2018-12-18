import java.io.*;
import java.util.*;
/*Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in place.
*/
public class Solution {
    public void setZeroes(int[][] matrix) {
        boolean fr=false, fc=false;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0){
                    if(i==0)fr=true;
                    if(j==0)fc=true;
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
            
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++)
            {
                if(matrix[i][0]==0 || matrix[0][j]==0)
                    matrix[i][j]=0;
            }
        }
        
        if(fr)
        {
            for(int j=0;j<matrix[0].length;j++)
                matrix[0][j]=0;
        }
        if(fc)
        {
            for(int i=0;i<matrix.length;i++)
                matrix[i][0]=0;
        }
       for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++)
            {
              System.out.print(matrix[i][j]+"  ");
            }
         System.out.println();
       }
  }
  public static void main(String[] args) {
    int[][] matrix={{1,2,3},
                    {4,5,6},
                    {7,8,9},
                    {5,0,7},
                    };
    Solution m=new Solution();
    m.setZeroes(matrix);
  }
}
