package hw02;

import java.util.Scanner;

public class task07 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Введите сумму желаемого вклада: ");
	        int money = sc.nextInt();
	        System.out.println("Введите годовой процент: ");
	        int proc = sc.nextInt();
	        System.out.println("Введите колличество лет по вкладу");
	        int year = sc.nextInt();
	        sc.close();
	        int count = 0;
	        // 
	        while (true) {
	          money += ((money / 100) * proc);
	            if (count >= year) {
	                break;
	            }
	            count++;
	        }
	        System.out.println("Сумма вклада в банке " + money);
	}
}