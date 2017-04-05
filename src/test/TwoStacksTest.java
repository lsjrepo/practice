package test;

import shujujiegou.TwoStacks;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by lsj on 17-4-5.
 */
public class TwoStacksTest {
    @org.junit.Test
    public void test() throws Exception {
        TwoStacks ss=new TwoStacks();
            int[] a={1,2,3,4,5,23,21,45,19};
        ArrayList<Integer> myarraylist=ss.twoStacksSort(a);
        for(Integer items:myarraylist){
            System.out.printf("%d ",items);
        }
    }

}