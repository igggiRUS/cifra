package java224.hw07array;

import java.util.Random;

public class Info2 {
    public static void main(String[] args) {
        Random rand = new Random();

        // 0 1 2 3 4 5
        // 9 8 5 1 3 0
        double[] list1 = new double[6];
        for (int i = 0; i < list1.length; i++) {
            list1[i] = rand.nextDouble(0, 10);
        }
        //  0  1  2  3  4  5  6  7
        // 20 28 30 21 22 26 21 20
        double[] list2 = new double[8];
        for (int i = 0; i < list2.length; i++) {
            list2[i] = rand.nextDouble(20, 30);
        }

        //  0  1  2  3  4  5  6  7  8  9 10 11 12 13
        //  9  8  5  1  3  0 20 28 30 21 22 26 21 20
        double[] union = new double[list1.length + list2.length];

    }
}

