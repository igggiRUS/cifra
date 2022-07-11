package java224.hw04Bin;

/**

 * 3 разряд 2 разряд 1 разряд 0 разряд
 * 01000000_10011000_00000000_00000000 ~ Побитовое NOT  (побитовое отрицание)
 * 11111111_01100111_11111111_11111111 = Если флаг был 1 станет 0 и на оборот
 */

public class Task0Not {
    public static void main(String[] args) {
        int flags = 24081979;
        int result = ~flags;
        System.out.printf("\n%32s =\n%32s\n", (Integer.toBinaryString(flags)), (Integer.toBinaryString(result)));
        System.out.printf("\n%32d", result);
    }
}
