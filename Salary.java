import java.util.Scanner;
public class Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary:");
        int salary = sc.nextInt();
        System.out.println("Enter your age:");
        int age = sc.nextInt();
       
        if(salary>=20000 || age<25) {
            System.out.println("You are eligible for loan");
            System.out.println("Enter your needed loan amount:");
            int loan = sc.nextInt();
        if(loan<50000) {
            System.out.println("Loan available");
        }
        else {
            System.out.println("Loan not available");
        }
    }
    }
    
}
