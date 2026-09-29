import java.util.Scanner;
public class Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        sc.nextLine();
        String address = sc.nextLine();
        System.out.println("My name is : " + name);
        System.out.println("My Age is : " + age);
        System.out.println("Address: " + address);
    }
    
}
