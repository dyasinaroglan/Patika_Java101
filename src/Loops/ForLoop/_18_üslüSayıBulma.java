package Loops.ForLoop;

import java.util.Scanner;

public class _18_üslüSayıBulma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("çarpılacak olan sayı :");
        int a = scanner.nextInt();
        System.out.println("üslü sayı :");
        int b = scanner.nextInt();
        int carpım=1;

        for (int i = 1; i <= b; i++) { //üstteki sayıyı döngüye almamızın sebebi üstteki sayı kadar çarpılmasını istediğim için
            carpım*= a;
        }
        System.out.println("cevap : " + carpım);
    }
}
