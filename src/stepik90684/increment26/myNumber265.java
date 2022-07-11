package increment26;

public class myNumber265 {
        public static void main(String[] args) {
            int x = 1, y = 5, z = 0;
            --y;
            x = 4 + y++;
            z += x--;
            x = y + z;
            System.out.print(++x);
        }
    }