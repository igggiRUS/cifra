package stepik90684.logic32;

import java.util.Scanner;

/**
 * На вход подаются 3 слова надо их расставить в порядке возрастания
 * <p>
 * Похоже на побитовое смещение
 * n присваивается значение a
 * a присваивается значение b
 * b присваивается значение n(старое значение a)
 * И в целом получилось что мы поменяли a и b местами, если выполнилась условие в if
 */
public class MyProgram3213v02 {
    public static void main(String[] args) {
        String str = "C++\n" + "Java\n" + "Python";
        Scanner sc = new Scanner(str);
//            Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        String n; // n - вспомогательная строка
        if (a.charAt(0) > b.charAt(0)) {
            n = a;
            a = b;
            b = n;
        } // сравниваем a и b
        if (a.charAt(0) > c.charAt(0)) {
            n = a;
            a = c;
            c = n;
        } // сравниваем a и c
        if (b.charAt(0) > c.charAt(0)) {
            n = b;
            b = c;
            c = n;
        } // сравниваем b и c
        System.out.println(a + "\n" + b + "\n" + c);
        sc.close();
    }
}
