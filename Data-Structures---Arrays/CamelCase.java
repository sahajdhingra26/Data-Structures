import java.io.*;
import java.util.*;

public class CamelCase {
  //Write code to generate all possible case combinations of a given lower-cased string
  public void allPerm(String A, String B, int n){
    if(B.length()==n){
      System.out.println(B);
      return;
    }
    int i=0;
    char c=A.charAt(i);
    
    while(!Character.isLetter(c)){
     B=B+c;
     i++;
     c=A.charAt(i); 
    }
    allPerm(A.substring(i+1), B+Character.toLowerCase(c), n);
    allPerm(A.substring(i+1), B+Character.toUpperCase(c), n);
  }
  public static void main(String[] args) {
    String A= "0abc";
    String B="";
    int n=A.length();
    CamelCase s=new CamelCase();
    s.allPerm(A,B,n);
  }
}
