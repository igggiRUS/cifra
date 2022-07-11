package hw02;

public class task06 {
	public static void main(String[] args) {
		// прямоугольник значения константы надо найти перимметр и площадь
		final int w = 12;
		final int h = 34;
		// я писал int программа предложила заменить на var
		var s = w * h;
		var p = 2 * (w + h);
// вывод по разному сделал
		System.out.println("Ширина прямоугольника: " + w + "\n" + "Высота прямоугольника: " + h + "\n" + "Периметр прямоугольника: " + 2 * (w + h) + "\n" + "Площадь прямоугольника: " + w * h);

System.out.println("var p = : " + p);
System.out.println("var s = : " + s);
	}
}
