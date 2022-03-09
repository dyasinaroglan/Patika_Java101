package Loops.WhileLoop;

import java.util.Scanner;

public class _03_WhileLoop {
    public static void main(String[] args) {
        /*
        1'den girdiğimiz sayıya kadar olan tek sayıları yazdıran program
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayı = scanner.nextInt();

        while (1 <= sayı) {
            if (sayı % 2 == 0) {
                System.out.println(sayı);
            }
            sayı--;
        }
    }
}

