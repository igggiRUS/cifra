package hw02;

import java.util.Scanner;

public class task12 {
	public static void main(String[] args) {

//проценты
		double x = 1;
		double y = 30;
		double z = 60;
//	 упаковка молока в миллилитрах;
		double packMilk = 900;
//	 стакан молока в миллилитрах
		double glass = 200;
		System.out.println("Введите общее колличество детей в школе: ");
		Scanner sc = new Scanner(System.in);
		double childs = sc.nextDouble();
		sc.close();
//	 сколько всего детей

//		1%
//		сколько недоедащих детей округляет строго в верх
		double skinnyKid1 = Math.ceil(childs / 100) * x;
//	 сколько надо пирожков
		double pie1 = skinnyKid1 * 2;
//	 сколько надо милиллитров молока
		double glassKids1 = glass * skinnyKid1;
		double packagingMilk1 = Math.ceil(glassKids1 / packMilk);
//	 	30%
//		сколько недоедащих детей округляет строго в верх
		double skinnyKid30 = Math.ceil(childs / 100) * y;
//	 сколько надо пирожков
		double pie30 = skinnyKid30 * 2;
//	 сколько надо милиллитров молока
		double glassKids30 = glass * skinnyKid30;
		double packagingMilk30 = Math.ceil(glassKids30 / packMilk);
//	 	60%
//		сколько недоедащих детей округляет строго в верх
		double skinnyKid60 = Math.ceil(childs / 100) * z;
//	 сколько надо пирожков
		double pie60 = skinnyKid60 * 2;
//	 сколько надо милиллитров молока
		double glassKids60 = glass * skinnyKid60;
		double packagingMilk60 = Math.ceil(glassKids60 / packMilk);
		System.out.println("Если недобор веса 1 % детей");
		System.out.println("===========================");
		System.out.println("Из них весом меньше 30 кг " + (int) skinnyKid1 + " детей");
		System.out.println("Общее колличество выдаваемых пирожков для детей меньше 30кг " + (int) pie1 + " шт.");
		System.out.println("Общее колличество молока для детей " + (int) glassKids1 + " ml");
		System.out.println("Сколько надо упаковок молока: " + (int) packagingMilk1 + " упаковок");
		System.out.println();

		System.out.println("Если недобор веса 30 % детей");
		System.out.println("============================");
		System.out.println("В школе всего " + (int) childs + " детей");
		System.out.println("Из них весом меньше 30 кг " + (int) skinnyKid30 + " детей");
		System.out.println("Общее колличество выдаваемых пирожков для детей меньше 30кг " + (int) pie30 + " шт.");
		System.out.println("Общее колличество молока для детей " + (int) glassKids30 + " ml");
		System.out.println("Сколько надо упаковок молока: " + (int) packagingMilk30 + " упаковок");
		System.out.println();

		System.out.println("Если недобор веса 60 % детей");
		System.out.println("============================");
		System.out.println("В школе всего " + (int) childs + " детей");
		System.out.println("Из них весом меньше 30 кг " + (int) skinnyKid60 + " детей");
		System.out.println("Общее колличество выдаваемых пирожков для детей меньше 30кг " + (int) pie60 + " шт.");
		System.out.println("Общее колличество молока для детей " + (int) glassKids60 + " ml");
		System.out.println("Сколько надо упаковок молока: " + (int) packagingMilk60 + " упаковок");
		System.out.println();

	}
}