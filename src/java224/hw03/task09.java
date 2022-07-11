package hw03;


import java.util.Scanner;

public class task09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите координату x1");
		int x1 = sc.nextInt();
		System.out.println("Введите координату y1");
		int y1 = sc.nextInt();
		System.out.println("Введите координату x2");
		int x2 = sc.nextInt();
		System.out.println("Введите координату y2");
		int y2 = sc.nextInt();
		sc.close();

		if ((x1 == x2) && (y1 != y2)) {
			System.out.println("ровная дорога");
		} else if (((x1 < x2) && (y1 < y2)) || ((x2 < x1) && (y2 < y1)) ) {
			System.out.println("подъем");
		} else if (((x1 < x2) && (y1 > y2)) || ((x2 < x1) && (y2 > y1)) ) {
			System.out.println("спуск");
		} else if ((x1 != x2) && (y1 == y2))  {
				System.out.println("вертикальная стена");
		} else {
			System.err.println("это точка а не отрезок");
		
		}
	}
}

