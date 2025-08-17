
package Lec3;
import java.util.Scanner;
public class bt4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("- Enter the first float number: ");
        float a=keyboard.nextFloat();
        System.out.print("- Enter the second float number: ");
        float b=keyboard.nextFloat();
        float c=(a+b)/2;
        System.out.println("-> Trung binh cong la: "+ c);
    }
}

