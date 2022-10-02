package in.kss.basic;

import java.util.Scanner;

/* printing the no from 1 to 10 */
public class SequencePrintNo {
    public static void main(String[] args) {
      /*  for( int i=1; i <= 10; i++){
            System.out.print(i+" ");
        }*/

        /*  improvise code taking input from user, from where to where to where printing */
        System.out.println("Enter ther no from where to where you want to print followed by enter");
        Scanner scn = new Scanner(System.in);
        int initialNo = scn.nextInt();
        int finalNo = scn.nextInt();

        for( int i = initialNo ; i <= finalNo ; i++) {
            System.out.print(i + " ");

        }


    }
}
