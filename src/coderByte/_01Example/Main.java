package coderByte._01Example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayı = scanner.nextInt();
        Faktoriyel f = new Faktoriyel();
        System.out.println(f.FirsFactorial(sayı));

    }
}
class Faktoriyel{
    int FirsFactorial(int num){
        if(num != 1){
            return num*FirsFactorial(num-1);
        }
        return num;
    }
}
