package aRepl_Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Num202_Arraylist_TimesTwo {


    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
        timesTwo(nums);
    }

    public static void timesTwo(ArrayList<Integer> nums) {

        for (int i = 0; i < nums.size(); i++) {
            nums.set(i, nums.get(i) * 2);
        }
        System.out.println(nums);
    }
}