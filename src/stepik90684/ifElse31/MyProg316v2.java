package ifElse31;

import java.io.Console;

public class MyProg316v2 {

	public static void main(String[] args) {
	// так как это пароль то работаем не через сканер а через консоль
		Console cons = System.console();
		String username = cons.readLine("User name: ");
		char [] passwd = cons.readPassword("ReadPassword" );
		
	}

}
