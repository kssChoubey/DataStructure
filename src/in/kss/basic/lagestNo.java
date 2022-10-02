package in.kss.basic;

import java.util.Scanner;

/* Finding largest no among 3 no */
public class lagestNo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
       // int max = 0;
        //int min = 0;


      /*  if(a > max) {
            max = a;
            System.out.println(max);

        if (b > max) {
            max = b;
            System.out.println(max);
            if (c > max) {
                max = c;
                System.out.println(max);
            }
        }
        }*/
/* Another Way*/

       /* max = a;
        System.out.println(max);

        if (b > max) {
            max = b;
            System.out.println(max);
            if (c > max) {
                max = c;
                System.out.println(max);
            }
        }*/

        /* Another Way*/

      int  max = Math.max(c,Math.max(a,b)); //using predefined method

        System.out.println("The largest no " + max);
    }
}
