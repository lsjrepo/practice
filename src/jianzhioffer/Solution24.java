package jianzhioffer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static dynamicP.QuanPaiLie.swap;

/**
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 *
 */
public class Solution24 {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> result=new ArrayList<>();
        if (str!=null&&str.length()>0){
            diedai(str.toCharArray(),0,result);
            Collections.sort(result);
        }
        return result;
    }

    private void diedai(char[] chars, int i, ArrayList<String> result) {
        if (i==chars.length-1){
            String val=String.valueOf(chars);
            if (!result.contains(val)){
                result.add(val);
            }
            else{
                for (int j=i;j<chars.length;++j){
                    swap(chars,i,j);
                    diedai(chars,i+1,result);
                    swap(chars,i,j);
                }
            }
        }
    }

}
