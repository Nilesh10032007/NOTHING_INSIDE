import java.util.Scanner;

public class taking_java_input {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the FIrst Number :");
        int Number = sc.nextInt();
        System.out.println("enter the secnumber");
        int secnumber = sc.nextInt();
        System.out.println(Number + secnumber);
        
        sc.close();
        
    }
    
}
