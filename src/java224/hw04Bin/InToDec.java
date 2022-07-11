package java224.hw04Bin;

import java.util.Scanner;

/**
 * Программа переводит битвое значение в десятичное число
 * 11111111111111111111111111111111
 * -1
 * 10000000000000000000000000000000
 * -2147483648
 * 1000000000000000000000000000000
 * 1073741824
 */
public class InToDec {
	public static void main(String[] args) {
		System.out.println("введите двоичный код мы сконвретируем его в десятичный");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		scanner.close();
//		 Целое.РазобратьЧисло(str, 2); число 2 это основание (битность) степень
		System.out.println("колличество символов: " + str.length());
		System.out.println("так число выглядит в бинарном виде: " + (Integer.parseUnsignedInt(str, 2)));
		}
}
