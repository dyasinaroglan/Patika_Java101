package coderByte._02Example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayı = scanner.nextInt();

        Faktoriyel1 f = new Faktoriyel1();

        System.out.println(f.faktoriyel(5));

    }
}


class Faktoriyel1{
    public int faktoriyel(int num){
        int carpım = 1;
        for (int i = 1; i <= num; i++) {
            carpım*=i;
        }
       return carpım;
    }
}
