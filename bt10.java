
package Lec3;
import java.util.Scanner;
public class bt10 {
    public static void main(String[] args) {
         Scanner a = new Scanner (System.in);
         
         System.out.print("- Enter: ");
         a.useDelimiter(",");
         while (a.hasNext())
         {
             if (a.hasNextInt())
             {
                 System.out.println("+ So da nhap: " + a.nextInt());
             }else
             {
                 System.out.println("+ Ki tu khong hop le: " + a.next());
             }
         }
    }
}
