package stepik90684.string27;

import java.util.Scanner;

public class task07Pay {
	public static void main(String[] args) {
		String str = "100000 25 2";
		Scanner sc = new Scanner(str);
		//		 Scanner sc = new Scanner(System.in);
	        System.out.println("ВВедите начальную сумму");
	        int money = sc.nextInt();
	        System.out.println("Процент");
	        int proc = sc.nextInt();
	        System.out.println("Кол-во Месяцев");
	        int mount = sc.nextInt();
	        sc.close();
	        int count = 1;
	        int z = 1;
	        // 
	        while (true) {
	          z = ((money / 100) * proc);
	            if (count >= mount) {
	                break;
	            }
	            count++;
	        }
	        System.out.println("Сумма вклада в банке " + z);
	}
}