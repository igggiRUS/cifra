package lesson02;

public class PrivedieTipov {
	public static void main(String[] args) {
//		float f = 123.2F;
		int a = 123;
		long l = a; // неявное приведение типов ненадо явно указывать в какой тип перевожу
		int x = (int) l; // явное приведение типов из long в int
		System.out.println(x);
/**
 * При явном и неявном преобразовании типов может
произойти переполнение (overflow) или потеря значений
(underflow). Java никак не контролирует эти процессы
и не выводит ошибки при компиляции или выполнении
программы.
 */
		
	}
}