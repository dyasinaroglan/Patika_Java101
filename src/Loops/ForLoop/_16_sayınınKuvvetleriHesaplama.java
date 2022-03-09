package Loops.ForLoop;

import java.util.Scanner;

public class _16_sayınınKuvvetleriHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayı = scanner.nextInt();
        int i = 1;

        while (true) {
            if (i <= sayı) {
                System.out.println(i);
            } else {
                break;
            }
            i *= 5;
        }
    }
}
