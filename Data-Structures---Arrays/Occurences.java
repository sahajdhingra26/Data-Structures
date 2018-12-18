import java.io.*;
import java.util.*;

public class Solution {
  
  public int count(int[] arr, int x, int n){
  int i;
  int j;
  i=first(arr,0,n-1,x,n);
  System.out.println("Start is "+i);
  if(i==-1)
    return 0;
  j=last(arr,i,n-1,x,n);
  System.out.println("End is "+j);
  if(j==-1)
	return 1;
  else
  return j-i+1;
  }
  //find the first occurence of the number
  public int first(int[] arr,int low,int high, int x,int n){
   
    if(high>=low){
      int mid=low+(high-low)/2;
      if(mid==0 || (arr[mid]==x && arr[mid-1]<x))
        return mid;
      else if(arr[mid]<x){
        int temp =first(arr,mid+1,high,x,n);
        if(temp!=-1){
          return temp;
        }
      }
      else{
        int temp=first(arr,low,mid,x,n);
        if(temp!=-1){
          return temp;
        }
      }
    }
    return -1;
  }
  //find the last occurence of the number
  public int last(int[] arr, int low, int high, int x, int n){
    if(high>=low){
      int mid=low+(high-low)/2;
    if(mid==n-1 || (arr[mid]==x && arr[mid+1]>x))
      return mid;
    else if(x<arr[mid]){
        int temp=last(arr,low,(mid-1),x,n);
        if(temp!=-1){
          return temp;
        }
      }
      else{
        int temp=last(arr,mid+1,high,x,n);
        if(temp!=-1){
          return temp;
        }
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    Solution sol=new Solution();
    int[] arr={1,2,2,2,3,3,4,5};
    int n=arr.length;
    int x=2;
    int c=sol.count(arr,x,n);
    System.out.println(x+" occurs "+c+" times");
   
  }
}
