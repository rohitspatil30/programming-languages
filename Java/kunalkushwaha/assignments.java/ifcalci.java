import java.util.Scanner;

public class ifcalci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("enter the operator :");
        char op = sc.next().charAt(0);
        if (op == '+') {
            System.out.println("the sum of the numbers are " + (num1 + num2));
        } else if (op == '-') {
            System.out.println("the differnece of the numbers are " + (num1 - num2));
        } else if (op == '*') {
            System.out.println("the product of the numbers are " + (num1 * num2));
        } else if (op == '/') {
            System.out.println("the sum of the numbers are " + (num1 / (float) num2));
        }
        sc.close();

    }

}
