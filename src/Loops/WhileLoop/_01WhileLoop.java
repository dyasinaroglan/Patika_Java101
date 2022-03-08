package Loops.WhileLoop;

public class _01WhileLoop {
    public static void main(String[] args) {
        //while(kosul)  --->true olduğu sürece kodlar çalışır.
        int i = 1;
        int k;
        System.out.println("program başladı");
        while (i <= 5) {
            System.out.println(i);
            i++; //arttırmazsak sonsuz döngüye girer.
            k = 1;
            while (k <= 10) {
                System.out.print(k + ",");
                k++;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("program bitti");
    }
}
