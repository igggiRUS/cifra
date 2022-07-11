package test;

public class task01 {
	public static void main(String[] args) {
		
	int size = 10;
	for(int i = 0;i < size;i++)
	
	{
		for (int j = 0; j < i; j++) {
			if (0 < i && i < size - 1 && 0 < j && j < i - 1) {
				System.out.print('_');
			} else {
				System.out.print('*');
			}
		}
		System.out.print('\n');
	}
}
	}
