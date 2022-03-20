package loops.forLoop;

import java.util.Scanner;

public class YıldızlarlaSekilYapma {
    /*
     *       1    5 bosluk       1 yıldız
    ***      2    4 bosluk       3 yıldız
   *****     3    3 bosluk       5 yıldız
  *******    4    2 bosluk       7 yıldız
 *********   5    1 bosluk       9 yıldız
***********  6    0 bosluk       11 yıldız
             i      n-i           (2*i)-1
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("basamak sayısını giriniz");
        int n = scanner.nextInt();

        for (int i = 1; i <= 6 ; i++) {
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*i)-1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
