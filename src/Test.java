import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by lsj on 17-9-6.
 */
public class Test {
    public static void main(String[] args) {
        int[] a={46,79,56,38,40,84};
        quickSort1(a,0,a.length-1);
    }
    public static void swap(int[] a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    static void  quickSort1(int k[],int s,int t)//s、t分别为起点、终点元素的下标
    {//这里以首元素作枢纽元
        if(s>=t)return ;
        int i,j;
        i=s;//初始指向第一个元素
        j=t+1;//初始指向末元素的后一个位置
        while(true)
        {
            do{
                i++;
            }while(!(i==t || k[i]>=k[s]));
            do{
                j--;
            }while(!(j==s || k[j]<=k[s]));
            if(i<j)
            {
                swap(k,j,i);
            }
            else break;
        }
        swap(k,j,s);
        for (int p=0;i<k.length;i++){
            System.out.printf("%d ",k[i]);
        }
        System.out.println();
        quickSort1(k,s,j-1);
        quickSort1(k,j+1,t);
    }




    static void quickSort2(int k[],int s,int t)
    {//这里以首元素作为枢纽元
        if(s>=t) return;
        int i=s,j=s;
        while(++i <=t)//小于枢纽元的放到枢纽元的后面
        {
            if(k[i]<k[s])
            {
                swap(k,i,++j);
            }
        }
        swap(k,j,s);
        quickSort2(k,s,j-1);
        quickSort2(k,j+1,t);
    }
}
