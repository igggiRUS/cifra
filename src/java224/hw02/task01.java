package java224.hw02;
import static java.lang.Math.*; // При вызове математических методов можно явно указать класс что бы его не прописывать в формулах

public class task01 {
	public static void main(String[] args) {
		int x = 12;
		int y = 6;
		System.out.println("Деление чисел: " + x / y); // деление чисел
		System.out.println("Квадратный корень числа: " + sqrt(x)); // квадратный корень. Не указан класс Math он импортирован в начале кода
		System.out.println("Кубический корень числа: " + cbrt(y)); // кубический корень. Не указан класс Math он импортирован в начале кода
	}
}
