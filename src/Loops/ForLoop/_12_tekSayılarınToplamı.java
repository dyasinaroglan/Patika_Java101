package Loops.ForLoop;

import java.util.Scanner;

public class _12_tekSayılarınToplamı {
    public static void main(String[] args) {
        int sayı;
        int toplam = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("sayı giriniz");
            sayı = scanner.nextInt();
            if(sayı % 2 == 1){
                toplam+= sayı;
            }
        }
        while (sayı>0);

        System.out.println("toplam : " + toplam);
        }
    }

