import java.util.Scanner;

public class simpleInterst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter principal amount , rate of interest and time in years .");
        int principal = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();
        int simpleInterst = principal * rate * time;
        System.out.println("the simple interst is : " + simpleInterst);
        sc.close();
    }
}
