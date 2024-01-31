import java.util.Scanner;

public class rupeesToDollar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number in rupees :");
        int rupees = sc.nextInt();
        float dollar = rupees / (float) 75;
        System.out.println("the given rupees in dollar is :" + dollar);
        sc.close();
    }

}
