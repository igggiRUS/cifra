package hw02; 
import java.util.Scanner;

// наконц то получилось 
public class task02 {
	public static void main(String[] args) {
		System.out.println("Введите трехзначное целое число: ");
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine();
		sc.close();
		System.out.println("Вы ввели число: " + num);
		// по индексу забирает из строки числа
		char a = num.charAt(0);
		char b = num.charAt(1);
		char c = num.charAt(2);
		// преобразует Unicode значения в реальное значение символа
		int a1 = Character.getNumericValue(a);
		int b1 = Character.getNumericValue(b);
		int c1 = Character.getNumericValue(c);
		int summ = a1 + b1 + c1;
		System.out.println("Сумма всех чисел: " + num + " = " + a1 + " + " + b1 + " + " + c1 + " = " + summ);
	}
}