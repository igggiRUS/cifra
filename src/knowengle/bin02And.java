package knowengle;

public class bin02And {
    public static void main(String[] args) {
        System.out.println("Побитовая операция & И AND похоже на умножение (Побитовое умножение)" +
                "\nв побитовом представлении второе число работает как маска" +
                "\nМожно проверить включен ли (1) бит какого либо числа.");

        System.out.println("00000101 &  первое число");
        System.out.println("00000100 =  втророе число");
        System.out.println("00000100   пропустил единицы только которые и в 1 и во 2 числе");
        byte flags = 5; // двоичны вид:  00000101 &
        byte mask = 4; // двоичны вид:   00000100 =
//        byte resl = 4; // двоичны вид: 00000100

//        Проверить включен ли бит
        if ((flags & mask) == mask) System.out.println("Включен 2 бит числа");
        else System.out.println("Выключен 2 бит числа");


        System.out.println();
        System.out.println("x & y = &");
        System.out.println("1 & 1 = " + (1 & 1));
        System.out.println("0 & 0 = " + (0 & 0));
        System.out.println("0 & 1 = " + (0 & 1));
        System.out.println("1 & 0 = " + (1 & 0));


    }
}
