package loops.forLoop;

import java.util.Scanner;

public class Ebob_Ekok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n1 sayısını giriniz");
        int n1 = scanner.nextInt();
        System.out.println("n2 sayısını giriniz");
        int n2 = scanner.nextInt();
        int ebob =1;


        for (int i = 1; i <= n1 ; i++) {  //çünkü n1 sayısı en küçük n1 e kadar bölme işlemi yapsa yeter
            if(n1 % i == 0 && n2%i ==0){
                ebob = i;
            }
        }
        System.out.println(ebob);
    }
}
