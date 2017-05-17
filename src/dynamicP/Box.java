package dynamicP;

/**
 * Created by lsj on 17-5-16.
 * 有一堆箱子，每个箱子宽为wi，长为di，高为hi，
 * 现在需要将箱子都堆起来，
 * 而且为了使堆起来的箱子不到，
 * 上面的箱子的宽度和长度必须小于下面的箱子。
 * 请实现一个方法，求出能堆出的最高的高度，
 * 这里的高度即堆起来的所有箱子的高度之和。
   给定三个int数组w,l,h，分别表示每个箱子宽、长和高，同时给定箱子的数目n。
   请返回能堆成的最高的高度。保证n小于等于500。
   测试样例：
   [1,1,1],[1,1,1],[1,1,1]
 返回：1
 思路:
 最大严格上升子序列的问题
 */
public class Box {

    public int getHeight(int[] w, int[] l, int[] h, int n) {
        // write code here
        for(int i=0;i<n;i++){//按照宽度从大到小排序
            for(int j=i+1;j<n;j++){
                if(w[i]<w[j]){
                    swap(w,i,j);
                    swap(l,i,j);
                    swap(h,i,j);//
                }
            }
        }
        int[] maxH=new int[n];
        maxH[0]=h[0];//初始化
        int res=maxH[0];
        for(int i=1;i<n;i++){
            maxH[i]=h[i];
            int tmax=0;
            for(int j=i-1;j>=0;j--){
                if(w[j]>w[i]&&l[j]>l[i]){
                    tmax=(tmax>maxH[j])?tmax:maxH[j];
                }
            }
            maxH[i]+=tmax;
            res=res>maxH[i]?res:maxH[i];
        }
        return res;

    }
    public void swap(int[] a,int i,int j)
    {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
    }
}