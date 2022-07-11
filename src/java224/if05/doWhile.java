package if05;

public class doWhile {
	public static void main(String[] args) {

		int count = 32;
	String strZero = "0";
		do {
			System.out.print(strZero);
			--count;
		} while (count > 0);
		System.out.println(count);
	}
}