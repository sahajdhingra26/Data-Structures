import java.io.*;
import java.util.*;
/*Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.
*/
public class Num_Array{  
    private int[] sums;

    public NumArray(int[] nums) {
        if(nums.length != 0){
            sums = new int[nums.length];
        
            sums[0] = nums[0];
            System.out.print(sums[0]+" ");
            for(int i=1; i<nums.length; i++){
                sums[i] = nums[i] + sums[i-1];
                System.out.print(sums[i]+" ");
            }
            System.out.println();
        }
    }

    public int sumRange(int i, int j) {
        return i==0 ? sums[j] : sums[j]-sums[i-1];
    }
  
 public static void main(String[] args) { 
   int[] nums={1,2,4,6,5,8};
  Num_Array  numArray = new Num_Array(nums);  

  System.out.println(numArray.sumRange(0, 1));
  System.out.println(numArray.sumRange(1, 2));
  
 }  
  
}