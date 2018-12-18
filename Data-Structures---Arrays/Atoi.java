import java.io.*;
import java.util.*;
/*Implement atoi to convert a string to an integer.
Hint: Carefully consider all possible input cases.
*/

  
public class Atoi {
    public int myAtoi(String str) {
        if(str.length()==0)
            return 0;
        str=str.trim();
        int sign=1;
        double num=0;
        int i=0;
        if(str.charAt(0)=='-')
        {
            sign=-1;
            i++;
        }
        else if (str.charAt(0)=='+')
            i++;
       while(i<str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9')
       {
        num=num*10+ (str.charAt(i)-'0'); 
        i++;
       }
        num=num*sign;
        if(num<Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        if(num>Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        
        
        return (int)num;
    }

  public static void main(String[] args) {
        Atoi at = new Atoi();
        String s1="+-123";
        String s2="-122344587654323456956";
        String s3="+0611";
        
        System.out.println("Number for string "+ s1+":"+at.myAtoi(s1));
        System.out.println("Number for string "+ s2+":"+at.myAtoi(s2));
        System.out.println("Number for string "+ s3+":"+at.myAtoi(s3));
        
  }
  
}
