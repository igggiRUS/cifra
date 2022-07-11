package knowengle;

public class bin03AndInvert {
    public static void main(String[] args) {

        System.out.println("Побитовая операция & И похоже на умножение (Побитовое умножение)" +
                "\nв побитовом представлении второе число работает как маска" +
                "\nМожно проверить включен ли (1) бит какого либо числа." +
                "\n знак ~ делает число отрицательным так мы можем выключит не нужные флаги");

        System.out.println("00000101 &  первое число");
        System.out.println("11111011 = 00000100 >>> 11111011 втророе число ИНВЕРТИРУЕМ маску что бы выключить биты");
        System.out.println("00000001   пропустил единицы только которые и в 1 и во 2 числе" +
                "\nВыключили третий бит остальные не трогали");
//        Что бы выключить биты ИНВЕРТИРУЕМ МАСКУ
        byte flags = 5; // двоичны вид:          00000101 &
        byte mask = 4; // двоичны вид c маской:  11111011 = добавляем маску(инверсию)  ~00000100 == 11111011
//        byte resl = 2; // двоичны вид:         00000001

//        flags = (byte) (flags & ~mask); нижнняя строчка эта одно и то же
        flags &= ~mask;
        System.out.println(flags);


        System.out.println("Побитовая операция ~ НЕ операция инверсии (отрицания)");
        System.out.println("Побитовая операция & И");
        System.out.println("~x = ~");
        System.out.println("~1 = 0 :  " + (~1));
        System.out.println("~0 = 1 :  " + (~0));


        System.out.println();
        System.out.println("x & ~y = &");
        System.out.println("1 & ~1 = " + (1 & ~1));
        System.out.println("0 & ~0 = " + (0 & ~0));
        System.out.println("0 & ~1 = " + (0 & ~1));
        System.out.println("1 & ~0 = " + (1 & ~0));

    }
}
