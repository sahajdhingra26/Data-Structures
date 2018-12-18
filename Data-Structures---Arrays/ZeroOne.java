/* You are given an array of 0s and 1s in random order. Segregate 0s on left side and 1s on right side of the array. 
*/
public class ZeroOne {
  public static void main(String[] args) {
    int[] arr={0, 1, 1, 0, 0, 1, 1, 1, 0};
    int n=arr.length-1;
    int j=0;
    for(int i=0;i<arr.length;i++)
    {
     while(arr[j]==0)
       j++;
     while(arr[n]==1)
       n--;
      if(j<n)
      {
        arr[j]=0;
        arr[n]=1;
      }
      else
        break;
    }
    for(int i=0;i<arr.length;i++)
      System.out.print(arr[i]+", ");
  }
}

