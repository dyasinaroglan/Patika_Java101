package ifElse;

public class _02ifElse {
    public static void main(String[] args) {

        int var1 = 5;
        int var2 = 6;
        if((var2=1)==var1)
            System.out.println(var2);
        else
            System.out.println(++var2);   //var2 = 1 atandı artık ve ++var2 yaparak 1 daha eklendi ve sonuç 2
    }
}
