package loops.forLoop;

import java.util.Scanner;

public class class1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayı = scanner.nextInt();

        for (int i = 1; i <= 10 ; i++) {
            int carpım = sayı*i;
            System.out.println(sayı + "X" + i + "=" + carpım);
        }
    }
}
