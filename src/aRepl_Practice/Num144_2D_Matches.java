package aRepl_Practice;

import java.util.Scanner;

public class Num144_2D_Matches {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0 ;i<=rows-1;i++)
        {
            for(int j=0 ;j<=cols-1;j++)
            {
                arr[i][j]=inp.nextInt();
            }//end for cols
        }//end for rwos
        int matches = 0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[rows].length-1 ; j++) {
                if (arr[i][j]==arr[i][j+1]){
                    ++matches;
                }
            }
        }





        //your code here







        System.out.print("matches: "+matches);
    }
}
