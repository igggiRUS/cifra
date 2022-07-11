package stepik90684.logic32;

	import java.util.Scanner;
/*
 * На вход подаются целых три числа - день, месяц и год (по григорианскому календарю).
 *  Выведите true, если эти числа составляют валидную дату, и false - в противном случае.
 *  
 * 
 */
	class MyProgram3212IfElse {
	    public static void main(String[] args) {
	        System.out.println("введите дату 24 08 1979 например: ");    
	    	Scanner a = new Scanner(System.in);
	            int day = a.nextInt();
	            int mon = a.nextInt();
	            int year = a.nextInt();

	            if ((day >= 1 && day <= 31) && (mon >= 1 && mon <= 12) && year >= 0) {
	                if (day <= 29 && mon == 2 && (year % 400 == 0 || year % 4 == 0 && year % 100 != 0)) {
	                    System.out.println("true");
	                } else if (mon == 1 || mon == 3 || mon == 5 || mon == 7 || mon == 8 || mon == 10 || mon == 12 && (day >= 1 && day <= 31)) {
	                    System.out.println("true");
	                } else if ((mon == 4 || mon == 6 || mon == 9 || mon == 11) && (day >= 1 && day <= 30)) {
	                    System.out.println("true");
	                } else if (day <= 28 && mon == 2 && (year % 4 != 0 || (year % 100 == 0 && year % 400 !=0))) {
	                    System.out.println("true");
	                } else System.out.println("false");
	            } else {
	                System.out.println("false");
	            }
	        }
	    }

