import java.util.*;

public class kspattern2 {
    public static void pyr(int len) {
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= 2 * i; k++) {
                System.out.print("* ");
            }
            for (int j = 0; j < len - 1 - i; j++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter height(Enter 0 to exit):- ");
            int height = sc.nextInt();
            if (height == 0) {
                break;
            } else {
                pyr(height);
            }
        } while (true);
        sc.close();
    }
}