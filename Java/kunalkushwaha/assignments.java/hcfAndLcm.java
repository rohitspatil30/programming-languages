import java.util.Scanner;

public class hcfAndLcm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int HCF = 0, LCM = 0;
        System.out.println("enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("enter the option number you want to perform: ");
        System.out.println("1)HCF");
        System.out.println("2)LCM");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("finding HCF: ");
                int min = (num1 < num2) ? num1 : num2;
                for (int i = 1; i <= min; i++) {
                    if (num1 % i == 0 && num2 % i == 0) {
                        HCF = i;
                    } else {
                        continue;
                    }

                }
                System.out.println("the HCF of the numbers " + num1 + " and " + num2 + " is " + HCF);
                break;
            case 2:
                System.out.println("finding LCM");
                int max = (num1 < num2) ? num2 : num1;
                for (int i = 1; i <= max; i++) {
                    if ((num2 * i) % num1 == 0) {
                        LCM = (num2 * i);
                        break;
                    }

                    else {
                        continue;
                    }

                }
                System.out.println("the LCM is : " + LCM);
                break;
            default:
                System.out.println("invalid input: ");

        }
        sc.close();
    }

}
