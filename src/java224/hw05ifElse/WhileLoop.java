package java224.hw05ifElse;

public class WhileLoop {
    public static void main(String[] args) {

//   TODO: while (условие) <оператор>
        int number = 0;
//        Конструкция if проверяет один раз на совпадение
        // if (< условие >)
//      Если (число < 5)
        if (number < 5) {
            // <оператор > операторов может быть несколько
            System.out.println("If number is " + number + " less then five");
        }
//        Конструкция while это цикл loop цикл продожается то колличество итерраций (повторов) пока условие будет соблюдено
        // while (< условие >)
//        Пока (число < 5)
        while  (number < 5) {
            // <оператор > операторов может быть несколько
            System.out.println("While number is " + number + " less then five");
            number++;
        }
    }
}
//while();
//do while();
//for();
//for each();