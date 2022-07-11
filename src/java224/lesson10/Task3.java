package lesson10;

public class Task3 {
	public static void main(String[] args) {
// 10003_0003
		long result = 0;
		for (long number = 100_000_000L; number < 1_000_000_000L; number++) {
			int size = 0;
			for (long i = number; i > 0; i /= 10) {
				size++;
			}
			int power10 = 1;
			for (int i = 0; i < size / 2; i++) {
				power10 *= 10;
			}
			int high = (int) (number / power10);
			int low = (int) (number % power10);
			int highThirds = 0; // количество троек в старшей части
			while (high > 0) {
				int digit = high % 10;
				if (digit == 3) {
					highThirds++;
				}
				high /= 10;
			}
			int lowThirds = 0; // количество троек в младшей части
			while (low > 0) {
				int digit = low % 10;
				if (digit == 3) {
					lowThirds++;
				}
				low /= 10;
			}

			if (highThirds == lowThirds && highThirds > 0) {
				System.out.println(number);
			}
		}
		System.out.println("result = " + result);
	}
}