package Loops.ForLoop;

import java.util.Scanner;

public class _10_forLoop {
    public static void main(String[] args) {

        /*
        1'den girdiğim sayıya kadar çift sayıları yazdıran program.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayı = scanner.nextInt();

        for (int i =1; i<=sayı; i++){
            if(i%2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
