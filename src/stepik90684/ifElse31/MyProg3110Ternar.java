package ifElse31;

import java.util.Scanner;
/*
 * На вход подаётся целое число n. Выведите "YES", если можно построить 
 * правильный многогранник из правильных плоских
 *  n-угольников, в противном случае - "NO".
 *  подается число 3
 *  В помощь 
 *  https://ru.wikipedia.org/wiki/Правильный_многогранник
 *  столбик число сторон у грани должно быть 3 4 5
 *  Если выпадает любое из этих чисел то  можно создать многогранник
 */

public class MyProg3110Ternar {

	public static void main(String[] args) {
		System.out.println("введите число: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
//        ИЛИ ИЛИ тернарный 
		System.out.println((a == 3) || (a == 4) || (a == 5) ? "YES" : "NO");
	}
}