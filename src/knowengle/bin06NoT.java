package knowengle;

public class bin06NoT {
    public static void main(String[] args) {

byte x = 5;

        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(~x));
        System.out.println(~x);


        System.out.println("Побитовая операция ~ NOT НЕ операция инверсии (отрицания)");

        System.out.println("~x = ~");
        System.out.println("~1 = 0 :  " + (~1));
        System.out.println("~0 = 1 :  " + (~0));

    }
}
