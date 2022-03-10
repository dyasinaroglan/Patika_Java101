package loops.forLoop;

import java.util.Scanner;

public class _11_forLoop {
    public static void main(String[] args) {

        /*
        döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların
        ortalamasını hesaplayan programı yazınız.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayı = scanner.nextInt();

        for (int i = 0; i <= sayı; i++) {
            if (i % 12 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
