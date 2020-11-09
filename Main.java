package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int number=0;//輸入餐點的號碼

        int total=0;//總金額
        Scanner cin = new Scanner(System.in);

        String[] order = new String[3];//存取點的餐點

        String[][] lunch;//品目陣列
        lunch = new String[3][];
        lunch[0] = new String[] {"1.凱薩沙拉","2.火腿三明治"};
        lunch[1] = new String[] {"1.戰斧牛排","2.菲力牛排"};
        lunch[2] = new String[] {"1.紅茶","2.奶茶","3.綠茶"};

        int[][] money;//金額陣列
        money = new int[3][];
        money[0] = new int[] {20,25};
        money[1] = new int[] {120,160};
        money[2] = new int[] {20,25,20};

        System.out.println("菜單");
        for(int i=0;i<lunch.length;i++)
        {
            for (int k=0;k<lunch[i].length;k++)
            {
                System.out.print(lunch[i][k]+" "+money[i][k]+" ");
            }
            System.out.println(" ");
        }

        for(int i=0;i<lunch.length;i++)    //用以輸入餐點號碼
        {
            number = cin.nextInt();
            number-=1;

            total=total+money[i][number];

            order[i]=lunch[i][number];

        }

        for (int i=0;i<order.length;i++)
            System.out.print(order[i]+' ');
        System.out.println(' ');
        System.out.println("您本次餐點的金額"+" "+total);
    }
}