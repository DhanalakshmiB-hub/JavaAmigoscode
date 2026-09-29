import java.util.Scanner;
public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark1 = sc.nextInt();
        int mark2 = sc.nextInt();
        int mark3 = sc.nextInt();
        int mark4 = sc.nextInt();
        int mark5 = sc.nextInt();
        int marks = mark1 + mark2 + mark3 + mark4 + mark5;
        int average = marks/5;
        if(average<35) {
            System.out.println("Additional class is required");
        }
        else {
            System.out.println("You are good to go");
        }

    }
    
}
