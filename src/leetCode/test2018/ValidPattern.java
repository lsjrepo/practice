package leetCode.test2018;

import com.sun.xml.internal.bind.v2.model.core.ID;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author saijie.lu
 * @create 2018-08-19 18:08
 * leetCode 20
 **/
public class ValidPattern {

  public static void main(String[] args) {
    //
    Scanner sin=new Scanner(System.in);
    String s=sin.next();
    System.out.println(solution(s));

  }

  private static boolean solution(String s) {
    Stack<Character> stack=new Stack<>();
    for (int i=0;i<s.length();i++){
      if (s.charAt(i)=='{'||s.charAt(i)=='['||s.charAt(i)=='('){
        stack.push(s.charAt(i));
      }
      else {
        if (stack.isEmpty())  return false;
        char top=stack.pop();
        if (s.charAt(i)==')'&&top!='(') return false;
        if (s.charAt(i)==']'&&top!='[') return false;
        if (s.charAt(i)=='}'&&top!='{') return false;
      }
    }
    return true;
  }
}
