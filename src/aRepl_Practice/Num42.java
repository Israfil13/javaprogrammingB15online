package aRepl_Practice;

import java.util.Scanner;

public class Num42 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        if (number>0&&number%2==0){
            System.out.println(number+" is even");
        }if (number%2!=0){
            System.out.println(number+" is odd");
        }if (number==0){
            System.out.println(number+" is even");
        }
    }
}
