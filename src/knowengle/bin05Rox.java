package knowengle;

public class bin05Rox {
    public static void main(String[] args) {

        System.out.println("Побитовая операция ^ Исключающая ИЛИ XOR (ксор)" +
                "\nВ побитовом представлении переключает биты" +
                "\nПри операции XOR не происходит потеря данных эффект используют при шифровании данных");
        byte flags = 9; // двоичны вид:  00001001 ^
        byte mask = 17;  // двоичны вид: 00010001 =
//      byte resl = 24; // двоичны вид:  00011000

        System.out.println("00001001 ^  первое число");
        System.out.println("00010001 =  втророе число");
        System.out.println("00011000   Если у XOR единица то он переключает флаг на противоположный");
        System.out.println("00001001 ^=  первое число");
        System.out.println("00010001 =  первое число");
//        Переключает флаг на противоположный
        flags = (byte) (flags ^ mask);
        System.out.println(flags);

        flags ^= mask;
        System.out.println(flags);


        System.out.println("Побитовая операция ^ Исключающее ИЛИ XOR");
        System.out.println("x ^ y = ^");
        System.out.println("1 ^ 1 = " + (1 ^ 1));
        System.out.println("0 ^ 0 = " + (0 ^ 0));
        System.out.println("0 ^ 1 = " + (0 ^ 1));
        System.out.println("1 ^ 0 = " + (1 ^ 0));
    }
}
