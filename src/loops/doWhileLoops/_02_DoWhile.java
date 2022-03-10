package loops.doWhileLoops;

public class _02_DoWhile {
    public static void main(String[] args) {

        int i = 1, j = 1;
        while (i < 3) {
            do {
                System.out.print(j + ",");  //1,2,3,4
                j++;
            } while (j < 4);
            i++;
        }
    }
}
