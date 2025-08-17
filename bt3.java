
package Lec3;
import java.util.Scanner;
public class bt3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        System.out.println("- Enter the first integer: ");
        int a = keyboard.nextInt();
        System.out.println("- Enter the second integer: ");
        int b= keyboard.nextInt();
        int c=a+b;
        System.out.println("-> Sum: "+ c);
    }
}
