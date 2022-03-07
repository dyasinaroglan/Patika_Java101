package ifElse;

import java.util.Scanner;

public class _10_Nestedif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sıcaklığı giriniz");
        int temperature = scanner.nextInt();


        if(temperature>0){
            System.out.println("atmosfer basıncını giriniz");
            int pressure = scanner.nextInt();

            if (pressure>5){
                System.out.println("OK");
            }else {
                System.out.println("NOT OK");
            }
        }else {
            System.out.println("to cold the check");
        }
    }
}
