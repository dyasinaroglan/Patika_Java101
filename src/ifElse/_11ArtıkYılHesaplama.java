package ifElse;

import java.util.Scanner;

public class _11ArtıkYılHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("yıl giriniz");
        int yıl = scanner.nextInt();

        if(yıl%4 == 0){
            if(yıl%100 ==0 && yıl%400 != 0){
                System.out.println("artık yıl değildir");
            }else {
                System.out.println("artık yıldır.");
            }
        }else {
            System.out.println("artık yıl değildir");
        }
    }
}


