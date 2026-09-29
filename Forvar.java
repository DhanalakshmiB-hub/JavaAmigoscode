import java.util.Scanner;
public class Forvar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1:");
        int a = sc.nextInt();
        System.out.println("Enter num2:");
        int b = sc.nextInt();
        for(int i=a; i<=b; i=i+1)
        {
            System.out.println(i);
        }
    }
    
}
