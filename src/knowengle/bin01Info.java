package knowengle;

public class bin01Info {
    public static void main(String[] args) {

        int bin1 = 0b101011101011100;
        System.out.println("\nПобитовое число bin1: " + Integer.toBinaryString(bin1));

        int bin2 = 0b000000000000001;
        System.out.println("Побитовое число bin2: " + Integer.toBinaryString(bin2) + '\n');

        System.out.println("Побитовая операция ^ Исключающее ИЛИ XOR");
        int resultRox = bin1 ^ bin2;
        System.out.println(Integer.toBinaryString(resultRox));
        System.out.println("Побитовая операция | ИЛИ");
        int resultIli = bin1 | bin2;
        System.out.println(Integer.toBinaryString(resultIli));
        System.out.println("Побитовая операция & И");
        int resultI = bin1 & bin2;
        System.out.println(Integer.toBinaryString(resultI));
        System.out.println("Побитовая операция ~ НЕ операция инверсии (отрицания)");
        int resulInvert = ~bin1;
        System.out.println(Integer.toBinaryString(resulInvert));








    }
}
