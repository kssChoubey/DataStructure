package in.kss.basic;

import java.util.Scanner;

public class SearchingInArray {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter the number to find in array");
        int num = scn.nextInt();
        int array[] = {12,14,1,11,15,117};
        for (int i = 0; i < array.length; i++) {
            if(num ==array[i]){
                System.out.println("found Number at index " +i);
            }
        }
    }
}
