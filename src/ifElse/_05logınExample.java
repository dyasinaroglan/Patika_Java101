package ifElse;

import java.util.Locale;
import java.util.Scanner;

public class _05logınExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("kullanıcı adı giriniz");
        String userName = scanner.nextLine();
        System.out.println("şifre giriniz");
        String password = scanner.nextLine();

        if(userName.toLowerCase(Locale.ROOT).equals("patika") && (password.toLowerCase(Locale.ROOT).equals("java123"))){
            System.out.println("başarılı bir şekilde giriş yaptınız.");
        }else {
            System.out.println("giriş başarısız, tekrar deneyiniz!");
        }
    }
}
