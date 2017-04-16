package BinaryStudy;

/**
 * Created by lsj on 17-4-16.
 *  在n个顶点的多边形上有n只蚂蚁，这些蚂蚁同时开始沿着多边形的边爬行，请求出这些蚂蚁相撞的概率。(这里的相撞是指存在任意两只蚂蚁会相撞)

    给定一个int n(3<=n<=10000)，代表n边形和n只蚂蚁，请返回一个double，为相撞的概率。
    测试样例：
    思路:
    每一个顶点都有两种选择
    但是不相遇的可能情况只有2种
 */
public class Ants {
    public static double antsCollision(int n) {
        // write code here
        return (1-2/Math.pow(2,n));
    }

    public static void main(String[] args) {
        System.out.println(antsCollision(3));
    }
}