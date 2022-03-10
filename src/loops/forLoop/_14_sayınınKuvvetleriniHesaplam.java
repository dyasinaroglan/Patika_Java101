package loops.forLoop;

import java.util.Scanner;

public class _14_sayınınKuvvetleriniHesaplam {
    public static void main(String[] args) {
        /*
        girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran program.
         */
        Scanner scanner = new Scanner(System.in);
        int carpım =1;
        System.out.println("sayı giriniz");
        int sayı = scanner.nextInt();

        for (int i = 1; i <=sayı ; i*=2) {
            System.out.print(i + " ");
        }
    }
}
