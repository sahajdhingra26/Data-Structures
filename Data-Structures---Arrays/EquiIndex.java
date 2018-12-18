/* Equilibrium index of an array is an index such that the sum of elements at lower indexes    is equal to the sum of elements at higher indexes.
 */
public class EquiIndex {
  public int equilibrium(int[] arr)
  {
    int sum=0; int left=0;
    for(int i=0;i<arr.length;i++)
    {
      sum=sum+arr[i];
    }
    for(int i=0;i<arr.length;i++)
    {
      sum=sum-arr[i];
      if(sum==left)
        return i;
      left=left+arr[i];
    }
    return -1;
  }

  public static void main(String[] args) {
      EquiIndex s=new EquiIndex();
      int arr[] = {-7, 1, 5, 2, -4, 3, 0};
      System.out.println("Equilibrium index:"+ s.equilibrium(arr));
  }

}
