package loops.forLoop;

public class _01_forLoop {
    public static void main(String[] args) {

        for (int i = 0; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " "); //iki şekilde de yazabiliriz
            }

        }
    }
}
