package test;

public class fff1 {
	public static void main(String[] args) {
		int num = 10;
		for (int i = 0; i < num; i++) {
		    for (int a = 0; a <= num; a++) {
		        int x = num - i;
		        if (a > x) {
		            if (x == (a - 1) || i == (num - 1)) {
		                System.out.print("*");
		            } else {
		                System.out.print(" ");
		            }
		        } else {
		            System.out.print(" ");
		        }
		    }
		    for (int b = 0; b <= i; b++) {
		        if (b == i || i == (num - 1)) {
		            System.out.print("*");
		        } else {
		            System.out.print(" ");
		        }
		    }
		    System.out.print("\n");
		}
	}
}