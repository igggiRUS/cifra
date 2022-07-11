//package java224.hw07array;
//
//public class Info1 {
//
//    public static void main(String[] args) {
//        Random rand = new Random();
//        double[] number1 = new double[6];
//        System.out.println("Массив 1");
//        for (int i = 0; i < number1.length; i++) {
//            number1[i] = rand.nextDouble(0, 10);
//        }
//        double[] number2 = new double[8];
//        for (int i = 0; i < number2.length; i++) {
//            number2[i] = rand.nextDouble(20, 30);
//        }
//        double[] union = new double[number1.length + number2.length];
//        for (int i = 0; i < number1.length; i++) {
//            union[i] = number1[i];
//        }
//        for (int i = number1.length; i < union.length; i++) {
//            union[i] = number2[i - number1.length];
//        }
//    }
//
//
//}
//
