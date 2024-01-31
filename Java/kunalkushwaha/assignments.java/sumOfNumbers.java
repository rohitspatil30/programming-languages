import java.util.Scanner;

// import javax.print.event.PrintEvent;

public class sumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("the sum of the numbers is " + sum);
        sc.close();
    }

}
