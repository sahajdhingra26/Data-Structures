/*Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
*/
public class MergeArrays {
    public void mergeSorted(int[] nums1, int m, int[] nums2, int n) {
        if(m==0)
            nums1[0]=nums2[0];
            
        int index=m+n-1;
        int i=m-1;
        int j=n-1;
        while(i>=0)
        {
            if(j>=0 && nums2[j]>nums1[i])
            {   
                nums1[index]=nums2[j];
                index--;
                j--;
            }
            else{
                nums1[index]=nums1[i];
                index--;
                i--;
            }
        }
        if(j>=0)
        {
            while(j>=0)
            {
             nums1[index]=nums2[j];
             index--;
                j--;  
            }
        }
      for(Integer num: nums1)
        System.out.print(num+" ");
    }
  public static void main(String[] args)
  {
   int[] nums1={4,5,6,0,0,0};
   int[] nums2={1,2,3};
   MergeArrays merge=new MergeArrays();
   merge.mergeSorted(nums1, 3, nums2, 3);
  }
}