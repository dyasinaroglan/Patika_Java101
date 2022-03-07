package ifElse;

import java.util.Scanner;

public class _08_SayılarınSıralanması {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz");
        int sayı1 = scanner.nextInt();
        System.out.println("2.sayıyı giriniz");
        int sayı2 = scanner.nextInt();
        System.out.println("3.sayıyı giriniz");
        int sayı3 = scanner.nextInt();

        if(sayı1>sayı2 && sayı1>sayı3){
            if(sayı2>sayı3){
                System.out.println("sayı1>sayı2>sayı3");
            }else
                System.out.println("sayı1>sayı3>sayı2");
        }else if (sayı2>sayı1 && sayı2>sayı3){
            if(sayı1>sayı3){
                System.out.println("sayı2>sayı1>sayı3");
            }else
                System.out.println("sayı2>sayı3>sayı1");
        }else if (sayı3>sayı1 && sayı3>sayı2){
            if(sayı2>sayı1){
                System.out.println("sayı3>sayı2>sayı1");
            }else
                System.out.println("sayı3>sayı1>sayı2");
        }
    }
}
