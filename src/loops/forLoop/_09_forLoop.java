package loops.forLoop;

public class _09_forLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 2; ++i) {
            for (int j = 1; j < 4; ++j) {
                if (i == 1) continue;
                System.out.println(i + j);

            }
        }
    }
}
