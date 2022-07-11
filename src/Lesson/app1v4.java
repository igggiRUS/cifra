package Lesson;

//8 рядов добавили строки переворт
public class app1v4 {
    public static void main(String[] args) {
        final int size = 5;
        for (int i = 0; i < size; i++) {
            for (int j = size; j > i; j--) {
            for (j = 0; j < size -i; j++)
                System.out.print("@ ");
            }
            System.out.print('\n');
        }
    }
}
