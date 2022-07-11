package stepik90684.operator25;

import java.util.Scanner;

public class myNumber2516 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seconds1 = sc.nextInt();
        int seconds2 = sc.nextInt();
        sc.close();
        int hours1 = (seconds1 / ((int) Math.pow(60, 2)));
        int minute = ((((seconds1 % ((int) Math.pow(60, 2)))) / 60));
        int sec = ((((seconds1 % ((int) Math.pow(60, 2)))) % 60));
        System.out.println(String.valueOf(hours1) + ":" +String.valueOf(minute) + ":" + String.valueOf(sec));
        int hours2 = (seconds2 / ((int) Math.pow(60, 2)));
        int minute2 = ((((seconds2 % ((int) Math.pow(60, 2)))) / 60));
        int sec2 = ((((seconds2 % ((int) Math.pow(60, 2)))) % 60));
        System.out.format("%02d"+":"+"%02d"+":"+"%02d", hours2, minute2, sec2);

    }
}
