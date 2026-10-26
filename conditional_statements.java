
import java.util.Scanner;

public class conditional_statements {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the your age");
        int age = sc.nextInt();
       /* if (age >= 18){
            System.out.println("Eligible For vote");
        }
        else if (age <= 18)
        {
            System.out.println("Not Eligible for the vote ");
        } */
        
        int ans = (age > 18) ? 22 : 18;
        System.out.println(ans);
        
        sc.close();
    }
}
