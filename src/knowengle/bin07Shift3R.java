package knowengle;


public class bin07Shift3R {
    public static void main(String[] args) {

        System.out.println("Побитовый сдвиг в право с заполнением нулями" +
                "\n>> 3 тройной сдвиг деление на 8");
              System.out.printf("%d %d %d\n", (-7 >> 1), (-7 >> 2), (-7 >> 3));
        System.out.printf("%d %d %d\n", (-7 >>> 1), (-7 >>> 2), (-7 >>> 3));

          }
}
