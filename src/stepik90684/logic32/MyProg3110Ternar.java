package stepik90684.logic32;

import java.util.Scanner;

public class MyProg3110Ternar {

    public static void main(String[] args) {
        System.out.println("введите число: ");
        String str = "3";
        Scanner sc = new Scanner(str);
//        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
//        ИЛИ ИЛИ тернарный
        boolean one = (a == 3);
        boolean two = (a == 4);
        boolean three = (a == 5);
        System.out.println(one || two || three ? "Yes" : "No");
        }
    }

