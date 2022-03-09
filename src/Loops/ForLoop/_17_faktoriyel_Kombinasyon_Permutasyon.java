package Loops.ForLoop;

public class _17_faktoriyel_Kombinasyon_Permutasyon {
    public static void main(String[] args) {

        System.out.println(faktoriyel(5));
        System.out.println(permutasyon(5,2));
        System.out.println(kombinasyon(5,2));


    }

    public static long faktoriyel(int sayı) {
        int carpım = 1;
        for (int i = 1; i <= sayı; i++) {
            carpım *= i;
        }
        return carpım;
    }

    // TODO: 9.03.2022  C(n,r) = n! / ((n-r)! * r!)
    public static long kombinasyon(int n, int r) {
        if (n >= r) {
        }
        return permutasyon(n, r) / faktoriyel(r);
    }

    // TODO: 9.03.2022 P(n,r) = n!/(n-r)! 
    public static long permutasyon(int n, int r) {
        if (n >= r) {
        }
        return faktoriyel(n) / faktoriyel(n - r);
    }
}
