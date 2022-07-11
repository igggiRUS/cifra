package stepik90684.logic32;

import java.util.Scanner;

public class MyProg3110Betwise {

    public static void main(String[] args) {
        System.out.println("введите число: ");
        String str = "3";
        Scanner sc = new Scanner(str);
//        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        boolean result = ( 3 <= a && a <=5 );
            System.out.println(result);
        }
    }
