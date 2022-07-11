package stepik90684.logic32;

import java.util.Scanner;
/**
 * На вход подаются 3  слова надо их расставить в порядке возрастания
 *
 */
public class MyProgram3213 {
    public static void main(String[] args) {
//        String str = "C++\n" + "Java\n" + "Python";
//        Scanner scanner = new Scanner(str);
        Scanner scanner = new Scanner(System.in);
        String a1 = scanner.next();
        String b1 = scanner.next();
        String c1 = scanner.next();
        scanner.close();	
        char a = a1.charAt(0);
        char b = b1.charAt(0);
        char c = c1.charAt(0);

//########################################################
        	//		a < b < c
        if (((a < b) && (b < c))) {
            System.out.printf("%s\n%s\n%s\n", a1, b1, c1);
            //		a < c < b            
        } else if (((a < c) && (c < b))) {
            System.out.printf("%s\n%s\n%s\n", a1, c1, b1);
//########################################################
            //		b < a < c            
        } else if (((b < a) && (a < c))) {
            System.out.printf("%s\n%s\n%s\n", b1, a1, c1);
            //		b < c < a            
        } else if (((b < c) && (c < a))) {
            System.out.printf("%s\n%s\n%s\n", b1, c1, a1);
//########################################################
            //		c < a < b            
        } else if (((c < a) && (a < b))) {
            System.out.printf("%s\n%s\n%s\n", c1, a1, b1);
            //		c < b < a            
        } else if (((c < b) && (b < a))) {
            System.out.printf("%s\n%s\n%s\n", c1, b1, a1);
//########################################################
        } else {
        	System.out.println("даже не знаю что может случится");

        }
    }
}
