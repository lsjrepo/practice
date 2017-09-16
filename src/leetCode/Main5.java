package leetCode;

/**
 * Created by lsj on 17-9-14.
 */
public class Main5 {
    public static int[] twoSum(int[] numbers, int target) {

        int[] result=new int[2];
        int l=0;
        int r=numbers.length-1;
        while(l<r){
            if (numbers[l]+numbers[r]==target){
                result[0]=l+1;
                result[1]=r+1;
                break;
            }
            else if (numbers[l]+numbers[r]<target){
                l++;
            }
            else{
                r--;
            }

        }
        return result;
    }
    public static void main(String[] args) {
        int[] numbers={2, 7, 11, 15};

        int[] res=twoSum(numbers,9);
        for (int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
}
