import java.util.*;

public class kspattern {
    public static void zpatt(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("* ");
        }
        System.out.println();
        for (int j = 0; j < length - 2; j++) {
            for (int k = 0; k < (length - 2) - (j); k++) {
                System.out.print("  ");
            }
            for (int x = 0; x <= 0; x++) {
                System.out.print("* ");
            }
            for (int y = 0; y <= j; y++) {
                System.out.print("  ");
            }
            System.out.println();
        }
        for (int i = 0; i < length; i++) {
            System.out.print("* ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter the length(Enter '0' to exit):- ");
            int length = sc.nextInt();
            if (length == 0) {
                break;
            } else {
                zpatt(length);
            }

        } while (true);
        sc.close();
    }
}