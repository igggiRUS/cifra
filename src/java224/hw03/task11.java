package hw03;

// import static java.lang.Math.*; // При вызове математических методов можно явно указать класс что бы его не прописывать в формулах но я все же оставил не часто встречаю квадратные уравнение и хотелось бы иметь полную запись

import java.util.Scanner;

public class task11 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите a, b и c:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		sc.close();
		System.out.printf("%d %d %d", a, b, c);

//		System.out.println("ax^2 + bx + c = 0 Квадратное уравнение");

// D дискриминант решается по готовой формуле
		System.out.println("Нахождение дискриминанта по готовой формуле: D = b^2 - 4ac");
		double D = b * b - 4 * a * c;
		if (D > 0) {
			double x1 = (-b - Math.sqrt(D)) / (2 * a);
			double x2 = (-b + Math.sqrt(D)) / (2 * a);
//			System.out.printf("Корни x1 = %f x2 = %f", x1, x2);
		} else if (D == 0) {
			double x = -b / (2 * a);
//			System.out.printf("Корень x = %f", x);
		} else {
			System.out.println("Уравнение не имеет корней");
		}
	}
}
