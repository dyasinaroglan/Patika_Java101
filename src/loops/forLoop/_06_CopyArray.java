package loops.forLoop;

import java.util.Arrays;

public class _06_CopyArray {
    public static void main(String[] args) {
        String[] array = {"soğan","patates","domates","havuç"};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        String[] copyArray = new String[array.length];

        for (int i = 0; i < copyArray.length; i++) {
            copyArray[i] = array[i];
        }
        System.out.println(Arrays.toString(copyArray));
    }
}
