package loops.forLoop;

import java.util.Arrays;

public class _02ForLoopArray {
    public static void main(String[] args) {

        int[] array = {34, 3, 76, 12, 56};

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
    }
}
