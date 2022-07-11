package java224.hw05ifElse;

public class WhileLoop01 {
    public static void main(String[] args) {

//   Пока (условие соответствует) <исполнять оператор>
        final int start = -2;
        final int end = 3;
        int number = start;
String messageRus ="";
        while  (number < end) {
            // <оператор > операторов может быть несколько
            String message = "While " + number + " is less then " + end;
            System.out.println(message);
            messageRus = "Пока  " + number + " меньше  чем  " + end;
            number++;
        }
        System.out.println("at the end number is " + number);
        System.out.println("переменна была объявлена до цикла\n " + messageRus);
    }
}

