package knowengle;

public class bin04Or {
    public static void main(String[] args) {

        System.out.println("Побитовая операция | И OR похоже на сложение (Побитовое сложение)" +
                "\nЕсли хотя бы одно значение единица от ответ единица" +
                "\nПрименяют когда надо включить отдельный бит переменной.");

        byte flags = 8; // двоичны вид: 00001000 |
        byte mask = 5;  // двоичны вид: 00000101 =
//      byte resl = 13; // двоичны вид: 00001101

        System.out.println("00001000 |  первое число");
        System.out.println("00000101 =  втророе число");
        System.out.println("00001101   Если хоть 1 единица то в итоге единица");
//        Включить бит
        flags = ( byte)(flags | mask);
        System.out.println(flags);


        System.out.println("Побитовая операция | ИЛИ");
        System.out.println("x | y = |");
        System.out.println("1 | 1 = " + (1 | 1));
        System.out.println("0 | 0 = " + (0 | 0));
        System.out.println("0 | 1 = " + (0 | 1));
        System.out.println("1 | 0 = " + (1 | 0));

    }
}
