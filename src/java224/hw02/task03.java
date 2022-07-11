package  hw02;

public class task03 {
	public static void main(String[] args) {
		double x = 3.93456456279;
		// почему программа предложила сделать приведение числа?
		double result = Math.round(x);


		System.out.println("Округление до целого: " + result); // округление спомощью явного приведения
		System.out.println("Округление до целого с явным приведением прведением : " + ((int) result)); // округление спомощью явного приведения
	}
}
