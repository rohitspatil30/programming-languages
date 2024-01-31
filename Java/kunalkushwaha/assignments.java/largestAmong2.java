import java.util.Scanner;

public class largestAmong2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any two numbers: ");
        System.out.print("number 1: ");
        int num1 = sc.nextInt();
        System.out.print("number 2: ");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println("the larger number is: " + num1);
        } else {
            System.out.println("the larger number is: " + num2);
        }
        sc.close();
    }

}
