package lesson07;

public class app02 {
public static void main(String[] args) {
	
	int num = 0b1100;
	//   0000_1100
	// & 0000_0100
	
	
	int result = num & 0b0100;
	
	// true  && true   =>> true
	// false && false  =>> false
	// false && true   =>> false
	// true  && false  =>> false
	
	System.out.printf("%d -> %32s", num, Integer.toBinaryString(num) );
	System.out.println();
	System.out.printf("%d -> %32s", result, Integer.toBinaryString(result) );
	
}
}
