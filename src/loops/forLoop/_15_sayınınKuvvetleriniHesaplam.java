package loops.forLoop;

import java.util.Scanner;

public class _15_sayınınKuvvetleriniHesaplam {
    public static void main(String[] args) {
        /*
        girilen sayıya kadar olan 4 ve 5'ın kuvvetlerini ekrana yazdıran program.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayı = scanner.nextInt();

        int i = 1;
        while (true) {
            if (i <= sayı) {
                System.out.print(i);
            } else {
                break;
            }
            i*=4;
        }

    }
}
