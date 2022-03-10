package loops.forLoop;

import java.util.Scanner;

public class _13_forLoop {
    public static void main(String[] args) {

        /*
        döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
        girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.

         */
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;
        System.out.println("sayı giriniz");
        int sayı = scanner.nextInt();
        for (int i = 0; i <= sayı; i++) {
            if (i % 4 == 0 ) {
                toplam += i;
            }
        }
        System.out.println("toplam : " + toplam);
    }
}
