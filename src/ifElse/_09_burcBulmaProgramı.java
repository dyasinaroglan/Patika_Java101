package ifElse;

import java.util.Scanner;

public class _09_burcBulmaProgramı {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("doğduğunuz ayı giriniz : ");
        int month = scanner.nextInt();
        System.out.println("doğduğunuz günü giriniz");
        int day = scanner.nextInt();

        switch (month){  //case'ler neyi kontrol edecekse prantez içine o yazılır. burada case ay'ların içine giriyor ve kontrol ediyor.
            case 1 :
                if(day>=1 && day<=31){
                    if(day<=21){
                        System.out.println("oğlak burcu");
                    }else {
                        System.out.println("kova burcu");
                    }
                }else {
                    System.out.println("geçersiz bir gün girdiniz");
                }
                break;
            case 2 :
                if(day>=1 && day<=28){
                    if(day<20){
                        System.out.println("kova burcu");
                    }else {
                        System.out.println("balık burcu");
                    }
                }else {
                    System.out.println("geçersiz bir gün girdiniz");
                }
                break;
            case 3:
                if(day>=1 && day<=31){
                    if(day>=21){
                        System.out.println("balık burcu");
                    }else {
                        System.out.println("koç burcu");
                    }
                }else {
                    System.out.println("geçersiz bir gün girdiniz");
                }
                break;
            case 4:
                if(day>=1 && day<=30){
                    if(day>=21){
                        System.out.println("boğa burcu");
                    }else {
                        System.out.println("koç burcu");
                    }
                }else {
                    System.out.println("geçersiz bir gün girdiniz");
                }
        }
    }
}
