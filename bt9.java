
package Lec3;
import java.util.Scanner;
public class bt9 {
    public static void main(String[] args) {
         Scanner a = new Scanner (System.in);
            System.out.print("- Enter your age: ");
            int age=a.nextInt();
            a.nextLine();
            System.out.print("- Enter your name: ");
            String name= a.nextLine();
            System.out.println("Age : " + age);
            System.out.println("Name: " + name);
    }
}
