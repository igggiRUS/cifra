package ifElse31;

import java.util.Scanner;

public class MyProg316v1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String passwdData = sc.nextLine();
		String passUser = sc.nextLine();
		sc.close();
		if (passwdData.equals(passUser)) {
			System.out.println("Access is granted");
		} else {
System.out.println("Access is denied");
		}
	}

}

//System.out.print("Access is " + (in.nextLine().equals(in.nextLine()) ? "granted" : "denied"));

//  if (x.equals(y)) System.out.print("Access is granted");
//  else System.out.print("Access is denied");

