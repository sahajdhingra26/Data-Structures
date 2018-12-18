import java.io.*;
import java.util.*;
/*Given an array of integers, every element appears twice except for one. Find that single one.
*/
public class FindSingleNumber{  
  
public int singleNumber(int[] nums) {
        if(nums.length==1)
            return nums[0];
        if(nums.length==0) 
            return 0;
        int x=0;
        for(Integer n:nums)
            x=x^n;
        return x;
    } 
  
 public static void main(String[] args) {  
  FindSingleNumber s = new FindSingleNumber();  
  int[] nums={1,1,2,2,3,3,4,4,5};
  int x=s.singleNumber(nums);
  System.out.println("Single number is:"+ x);  
  
 }  
  
}
