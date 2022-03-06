import java.util.Scanner;

public class AsalSayıBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayı = scanner.nextInt();

        if(asal(sayı)){
            System.out.println(sayı + " sayı asaldır.");
        }else {
            System.out.println(sayı + " sayı asal değildir.");
        }

    }
    public static boolean asal(int num){
        int count = 0;
        for (int i = 2; i<num; i++){
            if(num%i ==0){
                count++;
            }
        }
        if(count == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
