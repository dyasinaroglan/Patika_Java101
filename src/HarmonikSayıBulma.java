import java.util.Scanner;

public class HarmonikSayıBulma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("n sayısını giriniz");
        int n = scanner.nextInt();
        double result = 0.0;
        for (int i = 1; i <= n; i++) {
            result += (1.0 / i); //bunlardan biri mutlaka double olması gerekir 1 olarak yazarsak hata veririz.
        }
        System.out.println(result);
    }
}
