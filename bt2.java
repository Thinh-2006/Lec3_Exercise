
package Lec3;
import java.util.Scanner;
public class bt2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        System.out.print("- Enter your name: ");
        String name= keyboard.nextLine();
        System.out.print("- Enter your age: ");
        int age= keyboard.nextInt();
        System.out.println("xin chao " + name + ", ban " + age + "tuoi roi" );
    }
}
