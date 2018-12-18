import java.io.*;
import java.util.*;
/*Given an array of integers, find out whether there are two distinct indices i and j in the array such that the difference between nums[i] and nums[j] is at most t and the difference between i and j is at most k.
*/
public class DuplicatesIII {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Integer> set=new TreeSet<Integer>();
        for(int i=0;i<nums.length;i++){
          Integer c=set.ceiling(nums[i]);
          if(c!=null && c-nums[i]<=t)
            return true;
          Integer f=set.floor(nums[i]);
          if(f!=null && nums[i]-f<=t)
            return true;
          
          set.add(nums[i]);
          if(set.size()>k)
            set.remove(nums[i-k]);
        }
      return false;  
    }

  public static void main(String[] args) {
        DuplicatesIII s = new DuplicatesIII();
        int[] nums={4,5,7,8,7};
        System.out.println(s.containsNearbyAlmostDuplicate(nums,2,0));
                
    
  }
}

