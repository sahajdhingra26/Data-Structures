import java.io.*;
import java.util.*;
//Check for balanced parentheses in an expression
public class ValidParentheses {
  public boolean isValid(String s)
  { HashMap<Character,Character> map=new HashMap<Character,Character>();
    map.put('(',')');
    map.put('{','}');
    map.put('[',']');
    map.put('<','>');
   
    char[] c=s.toCharArray();
    Stack<Character> stack=new Stack<Character>();
    stack.push(c[0]);
   
    for(int i=1;i<c.length;i++)
    {
      if(map.containsKey(c[i]))
      {
        stack.push(c[i]);
      }
      else
      { if(stack.isEmpty())
          return false;
        if(c[i]==map.get(stack.peek()))
          stack.pop();
      } 
    }
   if(stack.isEmpty())
     return true;
   return false;
  }
  public static void main(String[] args) {
     ValidParentheses paren=new ValidParentheses();
     String s="([)]";
     if(paren.isValid(s))
       System.out.println(s+": Valid");
    else
       System.out.println(s+": Not Valid");
  }
}
