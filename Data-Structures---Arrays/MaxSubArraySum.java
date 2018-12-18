import java.io.*;
import java.util.*;

//Largest Sum Contiguous Subarray
public class MaxSubArraySum {
  public static void main (String[] args){
        MaxSubArraySum ob=new MaxSubArraySum();
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is " +
                                       ob.maxSum(a));
    }
  public int maxSum(int[] a){
    int current_sum=0;
    int max_sum=0;
    for(int i=0;i<=a.length-1;i++){
      current_sum=current_sum+a[i];
      if(current_sum<0)
        current_sum=0;
      if(current_sum>max_sum)
        max_sum=current_sum;
    }
    return max_sum;
    
  }
}
