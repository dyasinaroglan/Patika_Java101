package ifElse;

import java.util.Locale;
import java.util.Scanner;

public class _04_SwitchCase {
    public static void main(String[] args) {
        /*
         Note: get exam results from user as string

    Write a Java program to evaluate exam result of student
    ex:
    'A'-> Excellent!!!
    'B'-> Well done
    'C'-> Good
    'D'-> Need improvement
    'F'-> Fail
    For anything else print this is not a valid result
     */

        Scanner scanner = new Scanner(System.in);
        System.out.println("sonucu giriniz");
        String sonuc = scanner.nextLine().toUpperCase(Locale.ROOT);

        switch (sonuc){
            case "A" :
                System.out.println("excellent");
                break;
            case "B":
                System.out.println("well done");
            case "C":
                System.out.println("Good");
                break;
            case "D" :
                System.out.println("Need improvement");
                break;
            case "F" :
                System.out.println("fail");
            default:
                System.out.println("This is not a valid result!");

        }
    }
}


