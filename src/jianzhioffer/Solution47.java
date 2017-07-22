package jianzhioffer;

/**
 * 请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）。
 * 在本题中，匹配是指字符串的所有字符匹配整个模式。
 * 例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
 */
public class Solution47 {
    public boolean match(char[] str, char[] pattern)
    {
        if (str==null||pattern==null){
            return false;
        }
        int strIndex=0;
        int patternIndex=0;
        return judzge(str,strIndex,pattern,patternIndex);
    }

    private boolean judzge(char[] str, int strIndex, char[] pattern, int patternIndex) {
        if (strIndex==str.length&&patternIndex==pattern.length){
            return true;
        }
        if ((strIndex!=str.length)&&(pattern.length==patternIndex)){//str比pattern长,必定不匹配
            return  false;
        }
        //str结束了,pattern还没有结束类似aaa aaaa*b*c*这种情况
        if ((strIndex==str.length)&&(pattern.length!=patternIndex)){
            if (((patternIndex+1)<pattern.length)&&(pattern[patternIndex+1]=='*')){
                return judzge(str,strIndex,pattern,patternIndex+2);
            }
            return false;
        }
        //str未结束并且pattern未结束
        if (((patternIndex+1)<pattern.length)&&(pattern[patternIndex+1]=='*')){
            if ((pattern[patternIndex]==str[strIndex])||(pattern[patternIndex]=='.')&&strIndex!=str.length){
                return judzge(str,strIndex,pattern,patternIndex+2)||
                        judzge(str,strIndex+1,pattern,patternIndex+2)||
                        judzge(str,strIndex+1,pattern,patternIndex);
            }
            else{
                return judzge(str,strIndex,pattern,patternIndex+2);
            }

        }
        if ((pattern[patternIndex]==str[strIndex])||(pattern[patternIndex]=='.')&&strIndex!=str.length){
            return judzge(str,strIndex+1,pattern,patternIndex+1);
        }
        return false;

    }
}
