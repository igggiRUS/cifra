package knowengle;


public class bin07Shift {
    public static void main(String[] args) {

        System.out.println("Побитовый сдвиг в право делит на 2 число" +
                "\nПобитовый сдвиг в лево умножает число на 2" +
                "\n>> 1 одиночный сдвиг равен делениюу на 2" +
                "\n>> 2 двойной сдвиг деление на 4" +
                "\n>> 3 тройной сдвиг деление на 8");
        int x = 160;
        System.out.println(x);
        x = x >> 1;
        System.out.println(x);
        x = x >> 1;
        System.out.println(x);
        x = x >> 1;
        System.out.println(x);
        x = x >> 1;
        System.out.println(x);
        x = x >> 1;
        System.out.println(x);
        x = x >> 1;
        System.out.println(x);
        x = x >> 1;
        System.out.println(x);
//        дошли до единицы
        x = x << 1;
        System.out.println(x);
        x = x << 1;
        System.out.println(x);
        x = x << 1;
        System.out.println(x);
        x = x << 1;
        System.out.println(x);
        x = x << 1;
        System.out.println(x);
        x = x << 1;
        System.out.println(x);
        x = x << 1;
        System.out.println(x);

    }
}
