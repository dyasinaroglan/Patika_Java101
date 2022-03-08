package Loops.DoWhileLoops;

import java.util.Scanner;

public class _01_DoWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isPassword = true;
        do {
            System.out.println("şifre giriniz");
            int password = scanner.nextInt();
            if(password == 123){
                System.out.println("şifre doğru");
                isPassword = false;
            }else {
                System.out.println("şifre yanlış tekrar deneyiniz");
            }
        }while (isPassword);

        }
    }

