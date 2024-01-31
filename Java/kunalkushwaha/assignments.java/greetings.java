import java.util.Scanner;

// import javax.print.event.PrintEvent;

public class greetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your name:");
        String name = sc.nextLine();
        System.out.println("hello " + name + " ,nice to meet you.");
        sc.close();

    }
}
