package aRepl_Practice;

import java.util.Scanner;

public class Num30 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Item1, count and its price:");
        String item1=scan.next();
        int count1=scan.nextInt();
        double price1=scan.nextDouble();
        System.out.println("Enter Item2, count and its price:");
        String item2=scan.next();
        int count2=scan.nextInt();
        double price2=scan.nextDouble();
        System.out.println("Enter Item3, count and its price:");
        String item3=scan.next();
        int count3=scan.nextInt();
        double price3=scan.nextDouble();
        double totalItem1=count1*price1;
        double totalItem2=count2*price2;
        double totalItem3=count3*price3;

        if(count1==0){
        System.out.println("Item2: "+item2+" Price: " + totalItem2+", "+"Item3: "+item3+" Price: " + totalItem3);
    }  if (count2==0){
            System.out.println("Item1: "+item1+" Price: " + totalItem1+", "+"Item3: "+item3+" Price: " + totalItem3);
        }if (count3==0){
            System.out.println("Item1: "+item1+" Price: " + totalItem1+", "+"Item2: "+item2+" Price: " + totalItem2);
        }


        double report = (count1*price1)+(count2*price2)+(count3*price3);
        System.out.println("Total Price: " + report);



}}
