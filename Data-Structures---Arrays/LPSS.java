import java.io.*;
import java.util.*;
//longest palindromic subsequence
public class LPSS {
  public void palindrome(String str)
  { int longestFirst=0, longestLast=0;
    char[] ch=str.toCharArray();
   //for odd length
  for(int i=0;i<str.length();i++)
  { int left=i; int right=i;
 
      while(left>=0 && right<str.length())
      { if(ch[left]==ch[right])
       {
        if(right-left > longestLast-longestFirst)
        {
          longestLast=right;
          longestFirst=left;
        }
        left--;
        right++;
      }
       else
         break;
      }
  }
   //for even length
   for(int i=0;i<str.length();i++)
  { int left=i; int right=i+1;
   
      while(left>=0 && right<str.length())
      { if(ch[left]==ch[right])
       {
        if(right-left > longestLast-longestFirst)
        {
          longestLast=right;
          longestFirst=left;
        }
        left--;
        right++;
      }
       else
         break;
      }
  }
    System.out.println("Longest palindromic subsequence for " + str + " is "+ str.substring(longestFirst,longestLast+1));
}
  
  public static void main(String[] args) {
    LPSS s=new LPSS();
    s.palindrome("eabcbaf");
    s.palindrome("cabbbbca");
  }
}

