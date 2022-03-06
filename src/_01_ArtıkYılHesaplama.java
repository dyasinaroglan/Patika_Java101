import java.util.Scanner;

public class _01_ArtıkYılHesaplama {
    public static void main(String[] args) {

        /*
        Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:
        1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024 gibi.
        100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:
        Örneğin 1200, 1600, 2000 yılları artık yıldır ancak 1700, 1800 ve 1900 artık yıl değildir.
        Sadece 400'e tam olarak bölünebilenlerin artık yıl kabul edilmesinin nedeni,
        bir astronomik yılın 365,25 gün değil, yaklaşık olarak 365,242 gün olmasından kaynaklanan hatayı gidermektir.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("yıl giriniz");
        int yıl = scanner.nextInt();

        if ((yıl % 4 == 0 && yıl % 100 != 0) || (yıl % 400 == 0)) {
            System.out.println(yıl + " girilen yıl artık yıldır.");
        } else
            System.out.println(yıl + " girilen yıl artık yıl değildir.");
    }
}
