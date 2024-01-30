import java.util.Scanner;

/***
 * 
 * inheritance
 * polymorphism ---> overloading , overiding
 * static --> different
 * constructor --> done
 * array of objects
 */

class student {
    String name;

    // student(String name) {
    //     this.name = name;
    //     display();
    // }

    public void display() {
        System.out.println(name);
    }
}

class marks extends student{

    int marks;

    // @Override
    public void display() {
        System.out.println(marks);

    }
      

}

public class oops {
    public static void main(String[] args) {

        // array of objects;
        student[] s1 =new student[3];
        for(int i=0;i<3;i++){
            Scanner sc= new Scanner(System.in);
            System.out.println("enter the name");
            String n = sc.nextLine();
            s1[i] = new student();
            s1[i].name=n;
            s1[i].display();
        }
        marks s2 = new marks();
        s2.marks =45;
        s2.display();
        
    }
}