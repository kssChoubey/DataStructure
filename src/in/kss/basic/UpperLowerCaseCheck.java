package in.kss.basic;

import java.util.Scanner;

public class UpperLowerCaseCheck {
    public static void main(String[] args) {
        System.out.println("enter valid character tp check upper case or lower case");
        Scanner scn = new Scanner(System.in);
        char ch= scn.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lower Case");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Upper Case");

        }
        else {
            System.out.println("Invalid Entry");
        }

    }
}
