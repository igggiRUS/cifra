package ifElse31;
/*
 * После решения задачи посмотрел решения других
 */

import java.util.Scanner;

public class ifElse315v3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextLine().length();
        int b = sc.nextLine().length();
        sc.close();
        if(a>b){
            System.out.print("Махатма");
            }else{
            System.out.print("Джавахарлал");
        }
	}
}

