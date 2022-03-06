package ifElse;

import java.util.Scanner;

public class _03_SwitchCase_HesapMakinesi {
    public static void main(String[] args) {

        int secim;

        Scanner scanner = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz");
        int sayı1 = scanner.nextInt();
        System.out.println("2.sayıyı giriniz");
        int sayı2 = scanner.nextInt();

        System.out.println("***MENU***\n1.toplama\n2.çıkarma\n3.çarpma\n4.bölme");

        System.out.println("seçim yapınız");
        secim = scanner.nextInt();

        switch (secim){
            case 1:
                System.out.println("toplam : " + (sayı1+sayı2));
                break;
            case 2:
                System.out.println("çıkarma : " + (sayı1-sayı2));
                break;
            case 3:
                System.out.println("çarpma : " + (sayı1*sayı2));
                break;
            case 4:
                if  (sayı2 != 0){
                    System.out.println("bölme : " + (sayı1/sayı2));
                }else
                    System.out.println(sayı1 + " 0'a bölünmez...tanımsız");
                break;
            default:
                System.out.println("geçersiz işlem tekrar deneyiniz...");
        }
    }
}
