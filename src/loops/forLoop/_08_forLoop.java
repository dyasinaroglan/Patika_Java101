package loops.forLoop;

import java.util.Scanner;

public class _08_forLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sayı;
        for (boolean isRun = true; isRun;){
            System.out.println("sayı giriniz");
             sayı = scanner.nextInt();
            if(sayı<0){
                isRun = false;
            }
        }
        System.out.println("sayı giriniz");
        sayı = scanner.nextInt();
        while (sayı>0){
            System.out.println("sayı giriniz");
             sayı = scanner.nextInt();
        }
    }
}
