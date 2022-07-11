package java224.hw04Bin;

public class mask {
    public static void main(String[] args) {
        int flags = 58; //111010
        int mask = 1;
        int n = 5;
//        что бы сложить все нули (задача 12) тут решение. Осталось только сложить все нули
//        инвертировали флаг побитовым И собираем флаги (1) это инвертированный (0)

        System.out.printf("%32s\n", (Integer.toBinaryString(flags)));
        System.out.printf("%32s\n", (Integer.toBinaryString(mask << n)));
        System.out.printf("%32s\n", (Integer.toBinaryString((~flags & (mask << n)))));


    }
}
