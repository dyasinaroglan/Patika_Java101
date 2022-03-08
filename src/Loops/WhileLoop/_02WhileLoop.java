package Loops.WhileLoop;

import java.util.Scanner;

public class _02WhileLoop {
    public static void main(String[] args) {
        boolean isPassword = false; //koşulun içini doldurmak için
        Scanner scanner = new Scanner(System.in);

        while (!isPassword){ //true ya çevirdik ki koşul dönsün
            System.out.println("şifre giriniz :");
            int password = scanner.nextInt();
            if(password == 123){
                System.out.println("şifre doğrudur");
                isPassword = true;
            }else {
                System.out.println("şifre yanlıştır tekrar deneyiniz");
            }

        }
    }
}
