package leetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * leetCode71
 */
public class Main2 {
    public static String simplifyPath(String path) {
        Stack<String> stack=new Stack<>();
        String[] str=path.split("/");
        for (String s:str){
            if (s.equals("..")&&!stack.isEmpty()){//遇到..弹出前面存储的数据
                stack.pop();
            }
            else if(!s.equals("..")&&!s.equals(".")&&!s.equals("")){
                stack.push(s);
            }
        }
        String dir="";
        while(!stack.isEmpty()){
            dir="/"+stack.pop()+dir;
        }
        if (dir.isEmpty()){
            return "/";
        }
        else return dir;
    }

    public static void main(String[] args) {
        System.out.println(simplifyPath("/a/./b/../../c/"));
    }
}
