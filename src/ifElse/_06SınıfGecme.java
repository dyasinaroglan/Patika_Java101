package ifElse;

import java.util.Scanner;

public class _06SınıfGecme {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("türkçe notunuz : ");
        int turkce = scanner.nextInt();
        System.out.println("matematik notunuz : ");
        int mat = scanner.nextInt();
        System.out.println("fizik notunuz : ");
        int fızık = scanner.nextInt();
        System.out.println("kimya notunuz");
        int kımya = scanner.nextInt();

        double avarage = (turkce+mat+fızık+kımya)/4;

        if(avarage<=55){
            System.out.println("sınıfta kaldınız");
        }else {
            System.out.println("sınıfı geçtiniz");
        }
    }
}
