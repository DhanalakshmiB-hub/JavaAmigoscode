import java.util.Scanner;
public class Tern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number a:");
        int a = sc.nextInt();
        System.out.println("Enter the number b:");
        int b = sc.nextInt();
        System.out.println(a>b ? "Num1 is greater" : "Num2 is greater");
    }
    
}
