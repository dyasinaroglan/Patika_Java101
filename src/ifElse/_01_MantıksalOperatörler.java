package ifElse;

public class _01_MantıksalOperatörler {
    public static void main(String[] args) {

        int a = 10, b = 20, c;
       /*
        boolean kosul1 = (a<b) && (a>c);  // TODO: 6.03.2022  && --> ve
        System.out.println(kosul1);
        boolean kosul2 = (a>b) || (a<c);  // TODO: 6.03.2022 || --> veya 
        System.out.println(kosul2);
        // TODO: 6.03.2022 !--> sonucun tersini verir.

        System.out.println(!kosul2);

        // TODO: 6.03.2022 ? ---> if else gibi çalışan soru işareti

        */

        c = (a == b) ? 3 : 2;
        System.out.println(c);  //a ile be eşit ise c değeri 3 dönsün değilse 2 dönsün demek.
        //burada önemli olan true veya false dönmesi onları kontrol ediyoruz.

        // TODO: 6.03.2022 ctrl+Alt+L

        boolean compare = (a==b);

        String str = compare ? "eşittir" : "eşit değildir";
        System.out.println(str);


    }
}
