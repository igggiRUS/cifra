package stepik90684.test28;

import java.util.Scanner;

public class MyProgram287 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
//	System.out.println("Введите a, b и c:");
	double a = sc.nextDouble();
	double b = sc.nextDouble();
	double c = sc.nextDouble();
	sc.close();
//	System.out.printf("%f %f %f", a, b, c);
	//сумма
	double sum = (-1*b)/a;	
	//произведение
    double proizv = c/a;
    System.out.println(sum + " " + proizv);
	}
}
