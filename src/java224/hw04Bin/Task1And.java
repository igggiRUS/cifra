package java224.hw04Bin;

/**
 * Задание 1
 * Обнулить бит в нулевом разряде числа N. Остальные
 * биты не должны изменить свое значение. Вывести на кон-
 * соль в двоичном виде.
 * <p>
 * 3 разряд 2 разряд 1 разряд 0 разряд
 * 00000001_01101111_01110110_11111111 & побитовое И (побитовое умножение)
 * 11111111_11111111_11111111_11111110 =
 * 00000001_01101111_01110110_11111110
 * */
public class Task1And {
    public static void main(String[] args) {
        int flags = 24081979;
        byte mask = 0b01; // максимальное число для изменения младшего разряда 255 == 0b11111111
        int result = flags & ~mask;
        System.out.printf("\n%32s &\n%32s = стоит знак NOT отрицание числа поэтому число инвертированно\n%32s\n", (Integer.toBinaryString(flags)), (Integer.toBinaryString(~mask)), (Integer.toBinaryString(result)));
        System.out.printf("\n%32d &\n%32d =\n%32d", flags, mask, result);




    }
}
