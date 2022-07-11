package stepik90684.test28;

public class MyProgram286 {
	public static void main(String[] args) {
		int x = 5, y = 3;
		int z = ++x;
		y += x--;
		z += --x + y++;
		System.out.println(x + y + z);
	}
}
