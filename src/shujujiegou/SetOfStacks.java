package shujujiegou;

import java.util.ArrayList;

/**
 * Created by lsj on 17-4-5.
 *

 请实现一种数据结构SetOfStacks，由多个栈组成，其中每个栈的大小为size，
 当前一个栈填满时，新建一个栈。该数据结构应支持与普通栈相同的push和pop操作。
 给定一个操作序列int[][2] ope(C++为vector<vector<int>>)，
 每个操作的第一个数代表操作类型，若为1，则为push操作，
 后一个数为应push的数字；若为2，则为pop操作，后一个数无意义。
 请返回一个int[][](C++为vector<vector<int>>)，为完成所有操作后的SetOfStacks，
 顺序应为从下到上，默认初始的SetOfStacks为空。保证数据合法。

 */
public class SetOfStacks {
    public ArrayList<ArrayList<Integer>> setOfStacks(int[][] ope, int size) {
        // write code here
        ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> sonList=new ArrayList<Integer>(size);
        list.add(sonList);
        for(int i=0;i<ope.length;i++){
            switch (ope[i][0]){
                case 1:
                    if(sonList.size()!=size){
                        sonList.add(ope[i][1]);
                    }
                    else{
                        sonList=new ArrayList<Integer>(size);
                        sonList.add(ope[i][1]);
                        list.add(sonList);
                    }

                    break;

                case 2:
                    if (sonList.size()!=0){
                        sonList.remove(sonList.size()-1);

                    }
                    else{
                        list.remove(list.size()-1);
                        sonList=list.get(list.size()-1);
                        sonList.remove(sonList.size()-1);

                    }
                    break;
            }
        }

        return list;
    }
}
