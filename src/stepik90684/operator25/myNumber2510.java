package stepik90684.operator25;

import java.util.Scanner;

public class myNumber2510 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        sc.close();
        System.out.print((int) Math.pow(x, 1) + " " + (int) Math.pow(x, 2) + " " + (int) Math.pow(x, 3));
// решил но надо разобрать на вход целое но делаем дабл а потмо преобразуем в инт
        //        https://stepik.org/lesson/468802/step/10?unit=459622
    }
}
