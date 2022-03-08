package ifElse;

import java.util.Scanner;

public class CinZodYagıHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("doğum yılınızı giriniz");
        int dogumYılı = scanner.nextInt();

        if(dogumYılı%12 == 0){
            System.out.println("maymun");
        }else if(dogumYılı%12 ==1){
            System.out.println("horoz");
        }else if(dogumYılı%12 ==2){
            System.out.println("köpek");
        }else if(dogumYılı%12 ==3){
            System.out.println("domuz");
        }else if(dogumYılı%12 ==4){
            System.out.println("fare");
        }else if(dogumYılı%12 ==5){
            System.out.println("öküz");
        }else if(dogumYılı%12 ==6){
            System.out.println("kaplan");
        }else if(dogumYılı%12 ==7){
            System.out.println("tavşan");
        }else if(dogumYılı%12 ==8){
            System.out.println("ejderha");
        }else if(dogumYılı%12 ==9){
            System.out.println("yılan");
        }else if(dogumYılı%12 ==10){
            System.out.println("at");
        }else if(dogumYılı%12 ==11){
            System.out.println("koyun");
        }

    }
}
