package Loops.ForLoop;

public class _04_ArrayReserve {
    public static void main(String[] args) {
        String[] fruits = {"apple","banana","watermelon","peach","kiwi","strawberry"};

        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + " ");
        }
        System.out.println();
        for (int i = fruits.length-1; i >=0; i--) {
            System.out.print(fruits[i] + " ");
        }
    }
}
