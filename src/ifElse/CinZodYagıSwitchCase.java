package ifElse;

import java.util.Scanner;

public class CinZodYagıSwitchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sonuc, dogumYılı;
        String burc = null;

        System.out.println("doğum yılını giriniz");
        dogumYılı = scanner.nextInt();

        sonuc = dogumYılı%12;

        switch (sonuc){
            case 0:
                burc = "maymun";
                break;
            case 1:
                burc = "horoz";
                break;
            case 2:
                burc = "köpek";
                break;
            case 3:
                burc = "domuz";
                break;
            case 4:
                burc = "fare";
                break;
            case 5:
                burc = "Öküz";
                break;
            case 6:
                burc = "Kaplan";
                break;
            case 7:
                burc = "Tavşan";
                break;
            case 8:
                burc = "Ejderha";
                break;
            case 9:
                burc = "Yılan";
                break;
            case 10:
                burc = "At";
                break;
            case 11:
                burc = "Koyun";
                break;
        }
        System.out.println("cin zodyağı burcunuz : " + burc);
    }
}
