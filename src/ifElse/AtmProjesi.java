package ifElse;

import java.util.Scanner;

public class AtmProjesi {
    public static void main(String[] args) {
        String userName, password;
        Scanner scanner = new Scanner(System.in);
        /*
        Tabi sınırsız bir şekilde kullanıcı adı ve şifresi giremez belirli sayıda hakkı olması lazım
        3 hakkı olsun
         */
        int right = 3;
        int balance = 1500;
        int select;


        while (right > 0) {
            System.out.println("kullanıcı adı giriniz");
            userName = scanner.nextLine();
            System.out.println("şifreyi giriniz");
            password = scanner.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("sisteme doğru bir şekilde giriş yaptınız");
                System.out.println("HOŞGELDİNİZ...");
                do {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz");
                    System.out.println("1.PARA YATIRMA\n" +
                            "2.PARA ÇEKME\n" +
                            "3.BAKİYE SORGULAMA\n" +
                            "4.ÇIKIŞ YAP");
                    select = scanner.nextInt();
                    if (select == 1) {
                        System.out.println("para miktarını giriniz");
                        int price = scanner.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.println("para miktarı giriniz");
                        int price = scanner.nextInt();
                        if (price > balance) {
                            System.out.println("bakiye yetersiz");
                        } else {
                            balance -= price;
                        }
                    }else if (select == 3){
                        System.out.println("bakiyeniz : " + balance);
                    }
                } while (select != 4);
                break;
            } else {
                right--;
                System.out.println("hatalı kullanıcı adı veya şifre. Tekrar deneyiniz...");
                if (right == 0) {
                    System.out.println("hesabınız bloke olmuştur.Bankanızı arayınız...");
                }
                System.out.println("kalan hakkınız " + right);

            }
        }

    }
}
