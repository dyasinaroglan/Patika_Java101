package loops.forLoop;

import java.util.Scanner;

public class _07_UcakBiletiHesaplama {
    public static void main(String[] args) {
        /*
        Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
        Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
        Mesafe başına ücret 0,10 TL / km olarak alın.
        İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

        Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
         Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
        Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
        Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
        Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
        Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gidilecek mesafeyi giriniz : ");
        int mesafe = scanner.nextInt();
        System.out.println("yolcunun yaşını giriniz : ");
        int yas = scanner.nextInt();
        System.out.println("***yolculuk tipini seçiniz***\n1.tek yön\n2.gidiş-dönüş");
        int yolculukTipi = scanner.nextInt();



        double toplamBiletFiyatı = (double) mesafe*(0.10);
        int toplamIndırım =0;

        if(yolculukTipi ==2){
            double indirim = toplamBiletFiyatı*0.2;
            toplamIndırım+=indirim;
        }

        switch (yolculukTipi){
            case 1 :
                if(yas<12){
                   double indirim = toplamBiletFiyatı*0.5;
                   toplamIndırım+= indirim;
                }else if (yas>=12 && yas<=24){
                    double indirim = toplamBiletFiyatı*0.1;
                    toplamIndırım+= indirim;
                }else if(yas>65){
                    double indirim = toplamBiletFiyatı*0.3;
                    toplamIndırım+= indirim;
                }
             break;
            case 2 :
                if(yas<12){
                    double indirim = toplamBiletFiyatı*0.5;
                    toplamIndırım+= indirim;

                }else if (yas<=24){
                    double indirim = toplamBiletFiyatı*0.1;
                    toplamIndırım+= indirim;

                }else if(yas>65){
                    double indirim = toplamBiletFiyatı*0.3;
                    toplamIndırım+= indirim;

                }
                break;
            default:
                System.out.println("yanlış veri girdiniz");
                }

        System.out.println("toplam bilet fiyatı = " + (toplamBiletFiyatı-toplamIndırım));

        }

    }

