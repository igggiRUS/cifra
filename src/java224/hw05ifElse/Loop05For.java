package java224.hw05ifElse;
// TODO: 2:55 20220615 10 11 можно не делать https://youtube.com/shorts/1L__NMThUi0?feature=share
import java.util.Scanner;

public class Loop05For {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите два числа : ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        // for ( <действие до > ; <условие> проверяется при старте если условие не выполнится цилк прервется;
        // <действие в конце тела цикла>)
        for (int i = start; i <= end; i++) {
            System.out.println("current " + i);
            sc.close();
        }
        System.out.println("the end1");

        int n;
        if (start < end) {
            n = start;
            start = end;
            end = n;
        }
        System.out.printf("%d %d", start, end);
        System.out.println("Start Reverce");
        for (int i = start; i >= end; i--) {
            System.out.println("current " + i);
            if (start % 2 == 0);
                sc.close();
        }
        System.out.println("the end reverсе2");
    }
}

