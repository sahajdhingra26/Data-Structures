import java.io.*;
import java.util.*;
class Majority {
public int getMajority(int[] a){
  int c=getCandidate(a);
  int majority=validate(a, c);
  return majority;
}

public int getCandidate(int[] a)
{  int count=0; int candidate=0;
  for(Integer n:a)
  {
    if(count==0)
      candidate=n;
  
    if(candidate==n)
      count++;
    else
      count--;
  }
 return candidate;
}

public int validate(int[] arr, int majority)
{  int count=0;
  for(Integer a: arr)
  {
    if(a==majority)
      count++;
  }
 if(count>arr.length/2)
   return majority;
 return -1;
}


  public static void main(String[] args) {
      Majority s=new Majority();
      int[] a={3,1,7,7,1,1,7,7,3,7,7,7};
      System.out.println("Majority element:"+ s.getMajority(a));
    }
}
