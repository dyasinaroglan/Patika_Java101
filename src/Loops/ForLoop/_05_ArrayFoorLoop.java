package Loops.ForLoop;

public class _05_ArrayFoorLoop {
    public static void main(String[] args) {

        byte[] byteArray = new byte[3];

        for (int i = 0; i < byteArray.length; i++) {
            byteArray[i] = (byte) (Math.random()*127); //127 ile çarpıp byteArray[i] dizisinin içine attık
        }
        for (int i = 0; i < byteArray.length; i++) {
            System.out.println(byteArray[i]);

        }
    }
}
