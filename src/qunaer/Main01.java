package qunaer;

import java.util.Scanner;

public class Main01 {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        long question;

        long[] temp=new long[6];

        int[] money={1,5,10,50,100,500};
        for(int i=0;i<6;i++){
            temp[i]=in.nextLong();

            if(temp[i]<0||temp[i]>1000000000){

                return;

            }

        }

        question=in.nextLong();

        if(question<0||question>1000000000){

            return;

        }

        int count=0;

        int temps=0;

        for(int i=5;i>=0;i--){

            if(question>=money[i]){

                temps=(int) question/money[i];

                if(temp[i]<temps){

                    temps=(int) temp[i];

                }

                count+=temps;

                question=question-money[i]*temps;

            }

        }

        if(question==0){


            System.out.println(count);

        }else{

            System.out.println("NOWAY");

        }

    }

}
