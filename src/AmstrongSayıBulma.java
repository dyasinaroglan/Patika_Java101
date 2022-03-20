public class AmstrongSayıBulma {
    public static void main(String[] args) {

        /*
        sayı 3 basamaklı diyelim.
        sayının basamak sayılarını 3 defa çarpılıp toplanması ---Amstrong sayıyı verir.
        örneğin 153 ---> 3 basamaklı  (1*1*1)+(5*5*5)+(3*3*3)
         */
        int temp,birler,onlar,yüzler, toplam;
        for (int i = 100; i < 999; i++) { //3 basamaklıları alıyoruz.
            temp = i;

            birler= i%10; //birler basamağını bulduk
            temp = i/10; // burada da iki basamağa indirdik

            onlar = i%10;
            temp = i/10;

            yüzler = i%10;
            temp = i/10;

            toplam = (birler*birler*birler)+(onlar*onlar*onlar)+(yüzler*yüzler*yüzler);

            System.out.println(toplam);



        }
    }
}
