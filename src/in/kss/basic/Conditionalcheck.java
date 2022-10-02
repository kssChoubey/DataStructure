package in.kss.basic;

import java.util.Scanner;

/*check whether salary is more
        than 10,000 than increase 1000 else 500*/
public class Conditionalcheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float salary = scn.nextFloat();

        if (salary >= 10_000){
            salary += 1000;
        }
        else {
            salary += 500;
        }
        System.out.println("The Salary is : Rs"+ salary);
    }
}
