package in.kss.basic;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.sql.SQLOutput;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = {23,33,32,13,12,21,31,55,65,9};
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number to find In Array");
        int target = scn.nextInt();
       int result = linearSearch(array,target);
       if(result!=-1) {
           System.out.println("Number fount in index no " + result);
       }
       else
           System.out.println("Number not found in Array");
    }
    public static int linearSearch(int[] array, int target) {
        if(array.length==0){
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            int element = target;
            if (element == array[i]) {
                return i;
            }

        }
        return -1;

    }
}
