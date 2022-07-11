package Lesson;

//8 рядов добавили строки переворт
public class app1v5 {
    public static void main(String[] args) {
        final int size = 5;
        for (int i = 0; i < size; i++) {
            System.out.print("0 ");
            for (int j = size; j > i; j--) {
                System.out.print("*  ");
            }
            System.out.print("^ ");
            for (int j = 0; j <= i; j++) {
                System.out.print("# ");
                }
                System.out.print("@ ");
                System.out.print('\n');
            }

        }
    }


