package aRepl_Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Num139_FrontPiece {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        if (num.length>=3){
          int[]nums={num[0],num[1]};
            System.out.println(Arrays.toString(nums));
        }else if (num.length<2){
            System.out.println(Arrays.toString(num));
        }


    }
}
