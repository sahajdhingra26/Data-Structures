import java.io.*;
import java.util.*;
/*  
Longest Substring Without Repeating Characters  
*/

  
public class LongestSS {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
            return 0;
        if(s.length()==1)
            return 1;
                
        HashSet<Character> set=new HashSet<Character>();
        int max_count=0; int i=0, j=0;
        char[] c=s.toCharArray();
        while(i<s.length() && j<s.length())
        {
            if(!set.contains(c[j]))
            {
                set.add(c[j++]);
                if(set.size()> max_count)
                    max_count=set.size();
            }
            else
            {   
                set.remove(c[i++]);
            }
        }
        return max_count;
    }


  public static void main(String[] args) {
        LongestSS obj = new LongestSS();
        String s1="abcabcbb";
        String s2="pwwkew";
        
        
        System.out.println("Longest Substring Without Repeating Characters for "+ s1+":"+ obj.lengthOfLongestSubstring((s1)));
        System.out.println("Longest Substring Without Repeating Characters for "+ s2+":"+ obj.lengthOfLongestSubstring((s2)));
        
  }
  
}
