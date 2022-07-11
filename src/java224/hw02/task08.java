package hw02;

import java.util.Scanner;

public class task08 {
	public static void main(String[] args) {
		final int speed = 343; // скорость звука 343 метра в секунду
		System.out.println("Введите колличество секунд от раската до вспышки молнии: ");
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		sc.close();
		System.out.println( "Расстояние до молнии в метрах: " + (speed * time)+ " Метров" + "\n" + "Расстояние до молнии в километрах: " + ((float) (speed*time)/1000) + " Километров");
	}
}
