package lessonArrays;

import java.util.Scanner;

public class app1array {
    public static void main(String[] args) {
        System.out.println("Введите колличество дней ");
        Scanner sc = new Scanner(System.in);
        // nextInt это счетчик а он должен состоять из целых чисел
        double[]income = new double[sc.nextInt()];
        //        double[] income = new double[7];

        System.out.println("введите доход на каждый день");
        for (int i = 0; i < income.length; i++) {
            System.out.printf("%10f\n", income[i]);
            System.out.printf("День %2d: ", i + 1);
            income[i] = sc.nextDouble();
        }
//        поссле ввода все в одну полоску.

        System.out.println("результаты ввода");
                for (int i = 0; i < income.length; i++) {
            System.out.printf("%10f\n", income[i]);
        }
sc.close();
    }
}