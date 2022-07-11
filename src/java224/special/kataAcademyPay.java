package special;

import java.util.Scanner;

public class kataAcademyPay {

	public static void main(String[] args) {
		String str = "100000 25 24";
		Scanner sc = new Scanner(str);
//		Scanner sc = new Scanner(System.in);
		System.out.println("Введите начальную сумму");
		int money = sc.nextInt();
		System.out.println(money);
		
		System.out.println("Процент");
		int proc = sc.nextInt();
		System.out.println(proc);
		
		System.out.println("Кол-во Месяцев");
		int mount = sc.nextInt();
		System.out.println(mount);
		
		sc.close();
		int count = 1;
		int z = 0;
		//
		while (true) {
			z += ((money / 100) * proc);
			if (count >= mount) {
				break;
			}
			count++;
		}
		System.out.println("Общая сумма выплат " + z);
	}
}